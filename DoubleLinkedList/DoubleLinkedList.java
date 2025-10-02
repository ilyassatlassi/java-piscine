public class DoubleLinkedList implements LinkedList {
    private Node head;
    private Node tail;

    private class Node {
        int value;
        Node next;
        Node prev;
        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    
    }

    @Override
    public int at(int index) {
        // Implementation for accessing an element by its index
         if(index >= size() || index < 0) {
            return -1;
        }
          int count = 0;
          int value = 0;
        if(index == 0 ){
            return head.value;
        }
        if(index == size() -1){
           return tail.value;
        }
        if(index <=(size() -1 )/2 ){
            count = 1;
            Node curr = next(head);
            while(curr != null){
                if(count == index){
                    value = curr.value;
                    break;
                }
                count++;
                curr= next(curr);
            }
        }else {
            count = size() - 2;
            Node curr = prev(tail);
            while(curr != null){
                if(count == index){
                    value = curr.value;
                    break;
                }
                count--;
                curr= prev(curr);
            }
        }
        return value;

    }

    @Override
    public void add(int value) {
        // Implementation for adding an element at the end of the list
        if(head == null) {
            head = new Node(value);
            return;
        }
        if(tail == null) {
            tail = new Node(value);
            tail.prev = head;
            head.next = tail;
            return;
        }
        Node curr = new Node(value);
        tail.next = curr;
        curr.prev = tail;
        tail = curr;
    }

    @Override
    public void remove(int index) {
        // Implementation for removing an element by its index
        if(index >= size()) {
            return;
        }
        int count = 0;
        if(index == 0 ){
            head = head.next;
            head.prev = null;
            return;
        }

        if(index == size() -1){
            tail = tail.prev;
            tail.next = null;
            return;
        }
        if(index <= (size() - 1) /2 ){
            count = 1;
            Node curr = next(head);
            while(curr != null){
                if(count == index){
                    curr.next.prev = curr.prev;
                    curr.prev.next = curr.next;
                    break;
                }
                count++;
                curr= next(curr);
            }
        }else {
            count = size() - 2;
            Node curr = prev(tail);
            while(curr != null){
                if(count == index){
                    curr.next.prev = curr.prev;
                    curr.prev.next = curr.next;
                    break;
                }
                count--;
                curr= prev(tail);
            }
        }
    }

    @Override
    public int size() {
        // Implementation for getting the size of the list
        Node curr = head;
        int count = 0;
        while( curr != null) {
            count++;
            curr =curr.next;
        }
        return count;
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