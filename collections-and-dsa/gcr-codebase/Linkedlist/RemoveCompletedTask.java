 
public class RemoveCompletedTask {
    static class Node {
        int taskId;
        Node next;

        Node(int taskId) {
            this.taskId = taskId;
        }
    }
    static Node removeTask(Node head, int taskId) {

        if (head == null) {
            return null;
        }
        if (head.taskId == taskId) {
            return head.next;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr != null && curr.taskId != taskId) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }


    
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.taskId + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);
        head.next.next.next = new Node(104);
        System.out.println("Before Deletion:");
        printList(head);
        head = removeTask(head, 103);
        System.out.println("After Deletion:");
        printList(head);
    }
}