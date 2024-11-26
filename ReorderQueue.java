import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueue {
    public static void display(Queue<Integer> q) {
        int n = q.size();
        for (int i = 0; i < n; i++) {
            int x = q.peek(); 
            System.out.print(x + " "); 
            q.poll(); 
            q.add(x); 
        }
        System.out.println();
    }

    public static void reorder(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        
        // Pop the 1st half of the queue into the stack
        for (int i = 0; i < n / 2; i++) {
            st.push(q.peek()); 
            q.poll(); 
        }

        // Push the stack elements back to the queue
        while (!st.isEmpty()) { 
            q.add(st.peek());
            st.pop();
        }

        // Pop the 2nd half (now the first half) of the queue into the stack
        for (int i = 0; i < n / 2; i++) {
            st.push(q.peek());
            q.poll();
        }

        // Interleave the elements of stack and queue
        while (!st.isEmpty()) { 
            q.add(st.peek());
            st.pop();
            q.add(q.peek()); 
            q.poll(); 
        }

        // Reverse the queue using the stack
        while (!q.isEmpty()) { 
            st.push(q.peek());
            q.poll();
        }
        while (!st.isEmpty()) { 
            q.add(st.peek());
            st.pop();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        display(q); 
        reorder(q); 
        display(q); 
    }
}
