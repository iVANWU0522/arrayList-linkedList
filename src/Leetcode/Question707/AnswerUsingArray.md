```
class MyLinkedList {
    private int size;
    private int[] data;

    public MyLinkedList() {
        data = new int[4];
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        return data[index];
    }

    public void addAtHead(int val) {
        if (size == data.length) {
            resize(data.length * 2);
        }

        for (int i = size; i > 0; i--) {
            data[i] = data[i - 1];
        }

        data[0] = val;
        size++;
    }

    public void addAtTail(int val) {
        if (size == data.length) {
            resize(data.length * 2);
        }

        data[size] = val;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }

        if (size == data.length) {
            resize(data.length * 2);
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = val;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        if (size == data.length / 4) {
            resize(data.length / 2);
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;

        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    /**
     * tools method
     */

    public void resize(int newCap) {
        if (newCap < size) {
            return;
        }

        int[] temp = new int[newCap];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
```