public class DoubleLinkedList implements LinkedList {
    private Node head;
    private Node tail;

    private class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;

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
            head = new Node(value);tmp
            return;
        }

        if (tail == null) {
            tail = new Node(value);
            head.next = tail;
            tail.prev = head;
            return;
        }
        Node newNode = new Node(value);
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;

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
        if (size() == index + 1) {
            tail = tail.prev;
            tail.next = null;
            return;
        }
        Node curr = head.next;
        int count = 1;
        while (curr != null) {
            if (count == index) {
                // Node tmp = curr.prev;
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;

                break;
            }
            curr = next(curr);
            count++;

        }
    }

    @Override
    public int size() {
        // Implementation for getting the size of the list
        Node curr = head;
        int size = 0;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        return size;
    }

    private Node next(Node node) {
        // Implementation for going to the next
        System.out.println("Go to next node");
        return node.next;
    }

    private Node prev(Node node) {
        // Implementation for going to the prev

        System.out.println("Go to previous node");
        return node.prev;
    }
}