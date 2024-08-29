public class DeleteMiddle {
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node deleteMiddle(Node head) {
        if (head == null || head.next == null) return null; // Edge case: empty list or single node list
        
        Node middlePrev = null;
        Node slow = head;
        Node fast = head;
        
        // Use two-pointer technique to find the middle of the list
        while (fast != null && fast.next != null) {
            middlePrev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Delete the middle node
        if (middlePrev != null) {
            middlePrev.next = slow.next;
        }
        
        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // Linking nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Original List:");
        printList(a);

        // Corrected function call
        a = deleteMiddle(a);

        System.out.println("List after deleting the middle node:");
        printList(a);
    }
}
