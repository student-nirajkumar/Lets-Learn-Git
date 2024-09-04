import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read first list
        int n1 = sc.nextInt();
        Node head1 = null;
        for (int i = 0; i < n1; i++) {
            int data = sc.nextInt();
            head1 = insertAtEnd(head1, data);
        }

        // Read second list
        int n2 = sc.nextInt();
        Node head2 = null;
        for (int i = 0; i < n2; i++) {
            int data = sc.nextInt();
            head2 = insertAtEnd(head2, data);
        }

        // Check if lists are equal
        if (areListsEqual(head1, head2)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }

    public static Node insertAtEnd(Node head, int data) {
        Node nn = new Node(data);
        if (head == null) {
            return nn;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nn;
        return head;
    }

    public static boolean areListsEqual(Node head1, Node head2) {
        Node curr1 = head1;
        Node curr2 = head2;

        while (curr1 != null && curr2 != null) {
            if (curr1.data != curr2.data) {
                return false;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        // If both are null, lists are equal; otherwise, they are not
        return curr1 == null && curr2 == null;
    }
}
