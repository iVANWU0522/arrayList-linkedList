import java.util.NoSuchElementException;

public class MySinglyLinkedList<T> {

    private static class Node<T> {
        T val;
        Node<T> next;

        Node(T val) {
            this.val = val;
        }
    }

    private final Node<T> head, tail;
    private int size;

    public MySinglyLinkedList() {
    }

    /***** 增 *****/

    public void addFirst(T e) {
    }

    public void addLast(T e) {
    }

    public void add(int index, T element) {
    }

    public T removeFirst() {
    }

    public T removeLast() {
    }

    public T remove(int index) {
    }


    public T getFirst() {
    }

    public T getLast() {
    }

    public T get(int index) {
    }

    public T set(int index, T element) {
    }

    public int size() {
    }

    public boolean isEmpty() {
    }

    private boolean isElementIndex(int index) {
    }

    private boolean isPositionIndex(int index) {
    }

    private void checkElementIndex(int index) {
    }

    private void checkPositionIndex(int index) {
    }

    private Node<T> getNode(int index) {
    }
}