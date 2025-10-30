public class MyArrayList<T> {
    private int size;
    private static final int DEFAULT_CAPACITY = 16;
    private Object[] elements;

    public MyArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayList(int size){
        elements = new Object[size];
    }

    public void add(T t) {
        if(size == elements.length-1)
            resize(elements.length+16);
        elements[size++] = t;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index(" + index +") out of range.");
        }
        return (T) elements[index];
    }

    public void remove(int index) {
        for (int i = index; i<size; i++)
            elements[i] = elements[i+1];
        elements[size] = null;
        size--;
        if (elements.length > DEFAULT_CAPACITY && size < elements.length / 4)
            resize(elements.length/2);
    }

    public void addAll() {}

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }
}
