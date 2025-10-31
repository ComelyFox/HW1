import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<T> {
    private int size;
    private static final int DEFAULT_SIZE = 16;
    private Object[] elements;

    public MyArrayList(){
        elements = new Object[DEFAULT_SIZE];
        size = 0;
    }
    public MyArrayList(int size){
        elements = new Object[size];
        size = size;
    }

    public void add(T t) {
        if(size == elements.length-1)
            resize(elements.length+DEFAULT_SIZE);
        elements[size++] = t;
    }

    public void addAll(Collection<? extends T> c) {
        Object[] a = c.toArray();

        if(size + a.length >= elements.length-1)
            resize(size + a.length);

        System.arraycopy(a, 0, elements, size, a.length);
        size += a.length;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index(" + index +") out of range.");
        }
        return (T) elements[index];
    }

    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index(" + index +") out of range.");
        }
        if (index == 0) {
            index = size-1;
        }
        T oldValue = (T) elements[index];
        for (int i = index; i<size; i++)
            elements[i] = elements[i+1];
        elements[size] = null;
        size--;
        return (T) oldValue;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }
    public String toString() {
        String str = "";
        for(int i =0 ; i < size; i++)  {
            str = str.concat(elements[i].toString());
            if (i != size-1) {
                str = str.concat(", ");
            }
        }
        return "[" + str + "]";
    }
}
