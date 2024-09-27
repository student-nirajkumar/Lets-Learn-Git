public class ImplementationLLstack {
    public static class Node { 
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    
    public static class Stack {
        Node head;
        int size;
        
        Stack() {
            head = null;
            size = 0;
        }
        
        void push(int val) {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }
        
        void pop() {
            if (head == null) {
                System.out.print("Stack is Empty!");
                return;
            }
            head = head.next;
            size--;
        }
        
        int peek() {
            if (head == null) {
                System.out.print("Stack is Empty!");
                return -1;
            }
            return head.val;
        }
        
        void print(Node temp) {
            if (temp == null) return;
            print(temp.next);
            System.out.print(temp.val + " ");
        }
        
        void display() {
            Node temp = head;
            print(temp);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        
        System.out.println("Top element is: " + stack.peek());
        
        stack.pop();
        stack.display();
        
        System.out.println("Top element after pop is: " + stack.peek());
    }
}
