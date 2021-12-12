package customLinkedList;

import java.util.Objects;

public class CustomList<T> {
    public Node Node;
    Node header;

     public CustomList() {
        header = new Node(null, null, null);
    }

    /**
     * Add after the last item in the list
     */
    public Node add(T item) {
        Node end = getNode(size() - 1);
        Node next = new Node(null, end, item);
        end.next = next;
        return next;
    }

    /**
     * Add anywhere in the list, after the index of position index
     */
    public Node add(T item, int index) {
        if (index >= size() || index < 0) {
            throw new IndexOutOfBoundsException("pos = " + index + " does not exist");
        }

        Node nodeIns = null;

        if (item != null) {
            Node node = header;

            if (node.next != null) {
                for (int i = 0; i <= index; i++) {
                    node = node.next;
                }
            }

            nodeIns = new Node(node.next, node, item);

            if (node.next != null) {
                node.next.previous = nodeIns;
            }
            node.next = nodeIns;
        }
        return nodeIns;
    }

    /**
     * Delete object at specified index
     */
    public boolean delete(int index) {
        if (index >= size() || index < 0) {
            throw new IndexOutOfBoundsException("pos = " + index + " does not exist");
        }
        Node toBeRemoved = getNode(index);
        if (toBeRemoved == null)
            return false;
        Node previous = toBeRemoved.previous;
        Node next = toBeRemoved.next;

        previous.next = next;
        if (next != null) {
            next.previous = toBeRemoved.previous;
        }
        toBeRemoved = null;
        return true;
    }

    /**
     * Delete by specifying object -- removes first occurrence of a string
     */
    public boolean delete(T item) {
        int index = find(item);
        if (index == -1)
            return false;
        return delete(index);
    }

    /**
     * Get the specific node we are looking for at the position index
     */
    private Node getNode(int index) {
        if (index > size())
            throw new IndexOutOfBoundsException();
        Node node = header;
        for (int i = 0; i <= index; ++i) {
            node = node.next;
        }

        return node;
    }

    /**
     * Returns the index of the String s, if found; -1 otherwise
     */
    public int find(T item) {
        if (item == null)
            return -1;
        Node currentNode = header;
        int i = -1;
        while (currentNode.next != null) {
            ++i;
            currentNode = currentNode.next;
            if (item.equals(currentNode.value))
                return i;
        }
        return -1;
    }

    /**
     * Returns the size of the list
     */
    public int size() {
        int count = 0;
        Node node = header.next;
        while (node != null) {
            ++count;
            node = node.next;
        }
        return count;
    }

    /**
     * Returns true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return size() <= 0;
    }

    /**
     * Prints out the list in an array format
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node next = header.next;
        while (next != null) {
            sb.append(next.value + ", ");
            next = next.next;
        }
        String ret = sb.toString();
        if (ret.length() > 1) {
            ret = ret.substring(0, ret.length() - 2);
        }
        return (ret + "]");
    }

    /**
     * The class Node wraps the nodes for the doubly linked list. Its constructor
     * receives pointers to next and previous nodes, as well as, an object to which
     * will be the node's value.
     */

    class Node {
        T value;
        Node next;
        Node previous;

        Node() {
        }

        Node(Node next, Node previous, T value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }

        public String toString() {
            return value + "";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomList<?> that = (CustomList<?>) o;
        return Objects.equals(header, that.header);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header);
    }
}