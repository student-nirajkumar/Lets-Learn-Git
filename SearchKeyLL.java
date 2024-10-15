
    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public class SearchKeyLL {
        static boolean searchKey(int n, Node head, int key) {
            Node current = head;
            while (current != null) {
                if (current.data == key) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    
        public static void main(String[] args) {
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);
    
            int n = 4; 
            int key = 30; 
    
            boolean result = searchKey(n, head, key);
            if (result) {
                System.out.println("Key " + key + " found in the list.");
            } else {
                System.out.println("Key " + key + " not found in the list.");
            }
        }
    }
    
    

