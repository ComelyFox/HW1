public class MyHashSet {
    private static final int SIZE = 16;
    private static final float LOAD = 0.8f;

    private Node[] container;
    private int size;
    private Node lastNode;

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            next = null;
        }

        public String toString() {
            return String.valueOf(value) ;
        }
    }

    public MyHashSet(){
        container = new Node[SIZE];
        size = 0;
    }

    public void add(int value){
        if (contains(value)) {
            return;
        }

        int index = getIndex(value);
        Node newNode = new Node(value);

        newNode.next = lastNode;
        container[index] = newNode;
        size += 1;
        if (size > LOAD * container.length) {
            reSize();
        }
        lastNode = newNode;
    };

    public void remove(int value){
        int index = getIndex(value);
        Node head = container[index];
        Node prev = null;

        while (head != null) {
            if (head.value == value) {
                if (prev == null) {
                    container[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                size -= 1;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    private void reSize() {
        Node[] oldBuckets = container;
        container = new Node[oldBuckets.length];
        size = 0;

        for (Node head : oldBuckets) {
            while (head != null) {
                add(head.value);
                head = head.next;
            }
        }
    }

    private int getIndex(int value) {
        return hash(value) % (container.length - 1);
    }

    private int hash(int value) {
        int hash = value * container.length;
        return hash ^ (hash >>> 16);
    }

    public boolean contains(int value){
        int index = getIndex(value);
        if (index >= 0 && index < container.length && container[index] != null) {
            return container[index].value == value;
        }
        return false;
    }

    public String toString(){
        String str = "";
        for(int i =0, count = size; i < container.length-1; i++)  {
            if (container[i] != null){
                str = str.concat(container[i].toString());
                if (count > 1) {str = str.concat(", ");}
                count--;
            }
        }
        return "[" + str + "]";
    }
}

