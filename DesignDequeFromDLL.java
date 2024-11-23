import java.util.Deque;

public class DesignDequeFromDLL {

    // Node class represents an individual node in the doubly linked list
    class Node {
        int val; // Value stored in the node
        Node next; // Pointer to the next node
        Node prev; // Pointer to the previous node

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    // Deque class implemented using a doubly linked list
    class Deque {
        Node head; // Pointer to the first node
        Node tail; // Pointer to the last node
        int size;  // Size of the deque

        // Constructor to initialize an empty deque
        Deque() {
            head = tail = null;
            size = 0;
        }

        // Add a value at the back of the deque
        void pushBack(int val) {
            Node temp = new Node(val); // Create a new node with the value
            if (size == 0) { // If the deque is empty
                head = tail = temp;
            } else {
                tail.next = temp; // Link the new node to the current tail
                temp.prev = tail;
                tail = temp; // Update the tail pointer
            }
            size++; // Increment the size
        }

        // Add a value at the front of the deque
        void pushFront(int val) {
            Node temp = new Node(val); // Create a new node with the value
            if (size == 0) { // If the deque is empty
                head = tail = temp;
            } else {
                temp.next = head; // Link the new node to the current head
                head.prev = temp;
                head = temp; // Update the head pointer
            }
            size++; // Increment the size
        }

        // Remove a value from the front of the deque
        void popFront() {
            if (size == 0) { // If the deque is empty
                System.out.println("Deque is Empty!");
                return;
            }
            head = head.next; // Move the head pointer to the next node
            if (head == null) { // If the deque becomes empty
                tail = null;
            } else {
                head.prev = null; // Remove the link to the previous node
            }
            size--; // Decrement the size
        }

        // Remove a value from the back of the deque
        void popBack() {
            if (size == 0) { // If the deque is empty
                System.out.println("Deque is Empty!");
                return;
            }
            if (size == 1) { // If there is only one element
                head = tail = null; // Clear the deque
            } else {
                tail = tail.prev; // Move the tail pointer to the previous node
                tail.next = null; // Remove the link to the next node
            }
            size--; // Decrement the size
        }

        // Get the value at the front of the deque
        int front() {
            if (size == 0) { // If the deque is empty
                System.out.println("Deque is Empty!");
                return -1;
            }
            return head.val; // Return the value of the head node
        }

        // Get the value at the back of the deque
        int back() {
            if (size == 0) { // If the deque is empty
                System.out.println("Deque is Empty!");
                return -1;
            }
            return tail.val; // Return the value of the tail node
        }

        // Get the size of the deque
        int getSize() {
            return size;
        }

        // Check if the deque is empty
        boolean empty() {
            return size == 0;
        }

        // Display all the elements in the deque
        void display() {
            Node temp = head;
            while (temp != null) { // Traverse from head to tail
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DesignDequeFromDLL obj = new DesignDequeFromDLL();
        Deque dq = obj.new Deque(); // Instantiate the Deque

        // Add elements to the deque
        dq.pushBack(10);
        dq.pushBack(20);
        dq.pushBack(30);
        dq.pushBack(40);

        // Display elements in the deque
        dq.display(); // Output: 10 20 30 40

        // Add an element at the front
        dq.pushFront(5);
        dq.display(); // Output: 5 10 20 30 40

        // Remove an element from the front
        dq.popFront();
        dq.display(); // Output: 10 20 30 40

        // Remove an element from the back
        dq.popBack();
        dq.display(); // Output: 10 20 30
    }
}

    

