public class SingleLinkedList implements LinkedList {
    private Node head;
    private int size;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public int at(int index) {
        // Implementation for accessing an element by its index
        Node curr = head;
        int count = 0;
        while (curr != null) {
            if (count == index) {
                return curr.value;
            }
            curr = next(curr);
            count++;
        }
        count = -1;
        return count;

    }

    @Override
    public void add(int value) {
        // Implementation for adding an element at the end of the list
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node curr = head;
        while (curr != null) {
            if (curr.next == null) {
                curr.next = new Node(value);
                break;
            }
            curr = this.next(curr);
        }
        size();
    }

    @Override
    public void remove(int index) {
        // Implementation for removing an element by its index
        if (size() <= index) {
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node prev = head;
        Node curr = next(prev);
        Node next = head.next.next;
        int count = 1;
        while (curr != null) {
            if (count == index) {
                prev.next = next;
                break;
            }
            prev = curr;
            curr = next;
            next = next(next);
            count++;
        }
    }

    @Override
    public int size() {
        // Implementation for accessing an element by its index
        Node curr = head;
        size = 0;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        return size;
    }

    private Node next(Node node) {
        // Print the message "Go to next node"
        System.out.println("Go to next node");
        return node.next;
    }
}