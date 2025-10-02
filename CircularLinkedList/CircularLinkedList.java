
public class CircularLinkedList implements LinkedList {
    private Node head;

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
        if (index < 0 || head == null) {
            return -1;
        }
        if (index == 0) {
            return head.value;
        }
        int count = 0;
        Node curr = head;
        while (count != index) {
            if (count == index) {
            curr = next(curr);

                return curr.value;
            }
            curr = next(curr);
            count++;
        }
        return count;
    }

    @Override
    public void add(int value) {
        // Implementation for adding an element at the end of the list
        if (head == null) {
            head = new Node(value);
            head.next = head;
            return;
        }

        if (head.next == head) {
            head.next = new Node(value);
            head.next.next = head;
            return;
        }
        Node curr = next(head);
        while (curr != head) {
            if (curr.next == head) {
                curr.next = new Node(value);
                curr.next.next = head;
                break;
            }
            curr = next(curr);
        }
    }

    @Override
    public void remove(int index) {
        // Implementation for removing an element by its index
        if (index == 0) {
            head = head.next;

            Node prev = null;
            Node curr = head;
            Node next = head.next;
            while (next != head) {
                if (next.next == head) {
                    prev.next = next;
                    break;
                }
                prev = curr;
                curr = next;
                next = next(next);
            }
            return;
        }
        Node prev = head;
        Node curr = next(prev);
        Node next = head.next.next;
        int count = 1;
        while (curr != head) {
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
        // Implementation getting the size of the list
        if (head.next == head) {
            return 1;
        }

        Node curr = head.next;
        int count = 1;
        while (curr != head) {
            curr = curr.next;
            count++;
        }
        return count;
    }

    private Node next(Node node) {
        // Print the message "Go to next node"
        System.out.println("Go to next node");
        return node.next;

    }
}