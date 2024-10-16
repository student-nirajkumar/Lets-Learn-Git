
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public class InserationAttail {
        Node insertAtEnd(Node head, int x) {
            Node newNode = new Node(x);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            return head;
        }
    
        void printList(Node head) {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    
        public static void main(String[] args) {
            InserationAttail solution = new InserationAttail();
            Node head = null;
            
            head = solution.insertAtEnd(head, 10);
            head = solution.insertAtEnd(head, 20);
            head = solution.insertAtEnd(head, 30);
            head = solution.insertAtEnd(head, 40);
    
            solution.printList(head);  // Output: 10 20 30 40
        }
    }
    
    

