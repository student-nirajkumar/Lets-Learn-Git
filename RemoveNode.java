public class RemoveNode {
    public static class Node {
        int val;
        Node next;
        
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node remove(Node head, int n) {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        if (len == n) {
            return head.next;
        }
        
        temp = head;
        for (int i = 1; i < len - n; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }
    
    public static Node getNthFromEnd(Node head, int n) {
        int len = 0;
        Node temp =head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        
       
        if (n > len) {
            return null;
        }
        
        temp = head;
        
      
        for (int i = 1; i < len - n + 1; i++) {
            temp = temp.next;
        }
        
        return temp;
    }

    public static void printList(Node head) {
        Node temp = head;
        
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        
        a.next = b; 
        b.next = c; 
        c.next = d; 
        d.next = e;
        e.next = f;
        f.next = g;

        Node updatedHead = remove(a, 3); // Remove the 3rd node from the end
        printList(updatedHead); // Print the updated linked list
        
        Node nthNode = getNthFromEnd(updatedHead, 3);
        
        if (nthNode != null) {
            System.out.println("The 3rd node from the end has value: " + nthNode.val);
        } else {
            System.out.println("The 3rd node from the end does not exist.");
        }
    }
}
