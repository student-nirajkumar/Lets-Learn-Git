public class CirclarQueuefromArray {
        private int[] queue; // Array to store elements
        private int front;   // Index of the front element
        private int rear;    // Index of the rear element
        private int size;    // Current size of the queue
        private int capacity; // Maximum capacity of the queue
    
        // Constructor to initialize the circular queue
        public CirclarQueuefromArray(int capacity) {
            this.capacity = capacity;
            queue = new int[capacity];
            front = -1;
            rear = -1;
            size = 0;
        }
    
        // Enqueue: Add an element to the queue
        public boolean enqueue(int value) {
            if (isFull()) {
                System.out.println("Queue is full!");
                return false;
            }
    
            // If the queue is initially empty
            if (isEmpty()) {
                front = 0;
            }
    
            // Circular increment of the rear index
            rear = (rear + 1) % capacity;
            queue[rear] = value;
            size++;
            return true;
        }
    
        // Dequeue: Remove and return the front element
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1; // Return -1 to indicate an error
            }
    
            int removedElement = queue[front];
            
            // If only one element was in the queue, reset indices
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                // Circular increment of the front index
                front = (front + 1) % capacity;
            }
    
            size--;
            return removedElement;
        }
    
        // Peek: Get the front element without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1; // Return -1 to indicate an error
            }
            return queue[front];
        }
    
        // Check if the queue is empty
        public boolean isEmpty() {
            return size == 0;
        }
    
        // Check if the queue is full
        public boolean isFull() {
            return size == capacity;
        }
    
        // Display the elements in the queue
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }
    
            System.out.print("Circular Queue: ");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            CirclarQueuefromArray cq = new CirclarQueuefromArray(5);
    
            cq.enqueue(10);
            cq.enqueue(20);
            cq.enqueue(30);
            cq.enqueue(40);
            cq.enqueue(50);
            cq.display(); // Output: 10 20 30 40 50
    
            System.out.println("Dequeued: " + cq.dequeue()); // Output: 10
            cq.display(); // Output: 20 30 40 50
    
            cq.enqueue(60);
            cq.display(); // Output: 20 30 40 50 60
    
            System.out.println("Front element: " + cq.peek()); // Output: 20
        }
}
