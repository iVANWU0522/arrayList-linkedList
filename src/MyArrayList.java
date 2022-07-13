import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<T> implements Iterable<T> {
    private T[] data;

    private int size;

    private static final int INIT_CAP = 1;

    public MyArrayList() {
        this(INIT_CAP);
    }

    public MyArrayList(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public void addLast(T e) {
        int cap = data.length;

        if (size == cap) {
            resize(cap * 2);
        }

        data[size] = e;
        size++;
    }

    public void add(int index, T e) {
        checkPositionIndex(index);

        int cap = data.length;

        if (size == cap) {
            resize(cap * 2);
        }

        System.arraycopy(data, index, data, index + 1, size - index);

        data[index] = e;
        size++;
    }

    public void addFirst(T e) {
        add(0, e);
    }

    public T removeLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        }

        int cap = data.length;

        T deletedVal = data[size - 1];

        if(size == cap / 4) {
            resize(cap / 2);
        }

        data[size - 1] = null;
        size--;
        return deletedVal;
    }

    public T remove(int index) {
        checkElementIndex(index);

        int cap = data.length;

        if (size == cap / 4) {
            resize(cap / 2);
        }

        T deletedVal = data[index - 1];
 
        System.arraycopy(data, index, data, index - 1, size - index);
        data[size - 1] = null;

        size --;
        return deletedVal;
    }

    public T removeFirst() {
        return remove(0);
    }

    public T get(int index) {
        checkElementIndex(index);

        return data[index];
    }

    public T set(int index, T element) {
        checkElementIndex(index);
        
        data[index] = element;
        return element;
    }

    /**
     * Tool methods
     */
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // resize the capacity of the array
    private void resize(int newCap) {
        if (newCap < size) {
            return;
        }

        T[] temp = (T[]) new Object[newCap];

        for(int i = 0; i < size; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    /**
     * check if the index is able to store element
     */
    private void checkElementIndex(int index) {
        if (!isElementIndex(index)) {
            throw new NoSuchElementException("Index: " + index + ", Size: " + size);
        }
    }

    /**
     * check if the position is able to add element
     */
    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index)) {
            throw new NoSuchElementException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int p = 0;

            @Override
            public boolean hasNext() {
                return p != size;
            }

            @Override
            public T next() {
                return data[p++];
            }
        };
    }

    private void display() {
        System.out.println("size = " + size + " cap = " + data.length);
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<>(3);

        // for (int i = 1; i <= 5; i++) {
        //     arr.addLast(i);
        // }

        // arr.remove(3);
        arr.add(1, 9);
        // arr.addFirst(100);
        // int val = arr.removeLast();

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}