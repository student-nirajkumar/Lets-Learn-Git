public class Plaindromell {
    public static class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static Node getAtindex(Node head, int idx) {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public static boolean isPalindrome(Node head) {
        Node temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        int i = 0;
        int j = len - 1;
        while (i < j) {
            Node left = getAtindex(head, i);
            Node right = getAtindex(head, j);
            if (left.val != right.val) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(1);
       // Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
       // d.next = e;
        System.out.print("Linked List: ");
        printLinkedList(a);
       // Plaindromell obj = new Plaindromell();
        if (isPalindrome(a)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
