package custom;

public class LinkedList<T> {

    private Node first;

    /**
     * Returns the number of elements in this list
     */
    public int size() {
        int count = 0;
        Node node = first;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    /**
     * Adds in list element of generic type T
     *
     * @param value the element of generic type
     */
    public void add(T value) {
        if (first == null) {
            first = new Node(value);
        } else {
            Node tmp = first;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(value);
        }
    }

    /**
     * Returns the element at the specified position in this list
     *
     * @param index – index of the element to return
     * @return the element at the specified position in this list
     */
    public T get(int index) {
        Node node = first;
        while (index > 0) {
            index--;
            node = node.next;
        }
        return node.value;
    }

    /**
     * Removes the element at the specified position in this list
     *
     * @param index – the index of the element to be removed
     * @return the element at the specified position
     */
    public T remove(int index) {

        Node node = first;
        Node previous = null;
        while (index > 0) {
            index--;
            previous = node;
            node = node.next;
        }
        if (previous == null) {
            first = node.next;
        } else {
            previous.next = node.next;
        }
        return node.value;
    }

    private class Node {
        private final T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }
    }
}
