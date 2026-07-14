 
public class InsertTrackAfterCurrent {
    static class Node {
        int trackId;
        Node next;

        Node(int trackId) {
            this.trackId = trackId;
        }
    }
    static void insertAfter(Node current, int trackId) {
        if (current == null) {
            return;
        }
        Node newNode = new Node(trackId);
        newNode.next = current.next;
        current.next = newNode;
    }


    
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.trackId + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Before Insertion:");
        printList(head);
        Node current = head.next;
        insertAfter(current, 25);
        System.out.println("After Insertion:");
        printList(head);
    }
}