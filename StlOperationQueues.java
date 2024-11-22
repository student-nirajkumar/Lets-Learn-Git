import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StlOperationQueues {

    // Method to display the elements of the queue
    public static void displayQueue(Queue<Integer> queue) {
        int n = queue.size(); // Save the original size of the queue
        for (int i = 0; i < n; i++) {
            int x = queue.peek(); // Get the front element
            System.out.print(x + " "); // Print the element
            queue.poll(); // Remove the front element
            queue.add(x); // Add it back to the rear of the queue
        }
        System.out.println();
    }

    // Method to reverse the elements of the queue
    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        // Empty the queue into the stack
        while (queue.size() > 0) {
            int x = queue.peek();
            queue.poll(); // Remove element from the queue
            stack.push(x); // Push element onto the stack
        }
        // Empty the stack back into the queue (reversed order)
        while (stack.size() > 0) {
            int x = stack.peek();
            stack.pop(); // Remove element from the stack
            queue.add(x); // Add element back to the queue
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        displayQueue(queue);
        reverse(queue);
        displayQueue(queue);
    }
}

      //  System.out.print(queue.size() + " ");

       // Integer lastElement = null;
      //  for (int i = 0; i < queue.size(); i++) {
       //     lastElement = ((LinkedList<Integer>) queue).get(i);
       // }
       // System.out.print(lastElement + " ");

       // queue.poll();

       // System.out.print(queue.size() + " ");
        //System.out.print(queue.peek() + " ");
        



