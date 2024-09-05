public class Plaindromell {

    // Define the Node class
    public static class Node {
        int val;
        Node next;

        // Constructor for Node
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Get node at a specific index
    public static Node getAtindex(Node head, int idx) {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Check if linked list is a palindrome
    public boolean isPalindrome(Node head) {
        Node temp = head;
        int len = 0;

        // Calculate the length of the linked list
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // Use two-pointer technique to check if it's a palindrome
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

    // Print the linked list
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main function to test the code
    public static void main(String[] args) {
        // Creating the linked list
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Print the linked list
        System.out.print("Linked List: ");
        printLinkedList(a);

        // Create an instance of Plaindromell class
        Plaindromell obj = new Plaindromell();

        // Check if the linked list is a palindrome
        if (obj.isPalindrome(a)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
