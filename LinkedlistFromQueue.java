public class LinkedlistFromQueue {

    // Define the Node class
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Define the Queue class
    class MyQueue {
        Node head;
        Node tail;
        int size;

        MyQueue() {
            head = tail = null;
            size = 0;
        }

        // Push operation (equivalent to add in standard Queue)
        void push(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        // Poll operation (removes the front element)
        void poll() {
            if (size == 0) {
                System.out.print("Queue is Empty!");
                return;
            }
            Node temp = head;
            head = head.next;
            size--;
            delete(temp);//wastage nahi ho rahi hai
        }

        // Front element of the queue
        int front() {
            if (size == 0) {
                System.out.print("Queue is Empty!");
                return -1;
            }
            return head.val;
        }

        // Back element of the queue
        int back() {
            if (size == 0) {
                System.out.print("Queue is Empty!");
                return -1;
            }
            return tail.val;
        }

        // Display the contents of the queue
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Get the size of the queue
        int size() {
            return size;
        }

        // Check if the queue is empty
        boolean empty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        LinkedlistFromQueue list = new LinkedlistFromQueue();
        MyQueue q = list.new MyQueue();

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.display(); // Should display: 10 20 30 40

        q.push(50);
        q.push(60);
        q.display(); // Should display: 10 20 30 40 50 60

        q.poll();
        q.display(); // Should display: 20 30 40 50 60
    }
}
