public class Removeduplicatll {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeduplicate(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node a = head;
        Node b = head.next;

        while (b != null) {
            // Skip all duplicates
            while (b != null && b.data == a.data) {
                b = b.next;
            }

            a.next = b;  // Link to the next unique node
            a = b;       // Move to the next node
            if (b != null) {
                b = b.next;
            }
        }
        return head;
    }

    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(10);
        Node c = new Node(10);
        Node d = new Node(20);
        Node e = new Node(20);
        Node f = new Node(30);
        Node g = new Node(40);
        Node h = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        removeduplicate(a);
        printList(a);
    }
}
