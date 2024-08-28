public class Middle {
    public static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node middleNode(Node head){
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        int midIndx = len / 2;
        Node mid = head;
        for (int i = 1; i <= midIndx; i++) {
            mid = mid.next;
        }
        return mid;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b; 
        b.next = c; 
        c.next = d; 
        d.next = e;

        Node middle = middleNode(a);
        System.out.println("Middle Node data: " + middle.data);
    }
}
