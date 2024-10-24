public class CountNode {
        static class Node {
            int data;
            Node next;
            
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    
        public static int getCount(Node head) {
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
    
        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
    
            System.out.println("Count of nodes is: " + getCount(head));
        }
    }
