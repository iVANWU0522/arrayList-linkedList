import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyDoublyLinkedList<T> implements Iterable<T> {
    final private Node<T> head, tail;
    private int size;

    private static class Node<T> {
    }

    public MyLinkedList() {
    }

    public void addLast(T e) {
    }

    public void addFirst(T e) {
    }

    public void add(int index, T element) {
    }

    public T removeFirst() {
    }

    public T removeLast() {
    }

    public T remove(int index) {
    }

    public T get(int index) {
    }

    public T getFirst() {
    }

    public T getLast() {
    }

    public T set(int index, T val) {
    }

    /**
     * Tools 
     */

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private Node<T> getNode(int index) {
    }

    private boolean isElementIndex(int index) {
    }

    private boolean isPositionIndex(int index) {
    }

    private void checkElementIndex(int index) {
    }

    private void checkPositionIndex(int index) {
    }

    private void display() {
        System.out.println("size = " + size);
        for (Node<T> p = head.next; p != tail; p = p.next) {
            System.out.print(p.val + " -> ");
        }
        System.out.println("null");
        System.out.println();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            Node<T> p = head.next;

            @Override
            public boolean hasNext() {
                return p != tail;
            }

            @Override
            public T next() {
                T val = p.val;
                p = p.next;
                return val;
            }
        };
    }

}