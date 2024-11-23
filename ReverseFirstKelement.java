import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack; 

public class ReverseFirstKelement {
    public static void display(Queue<Integer> q) {
        int n = q.size();
        for (int i = 0; i < n; i++) {
            int x = q.peek(); // Use peek() to get the front element
            System.out.print(x + " ");
            q.poll();         // Use poll() to remove the front element
            q.add(x);         // Use add() to insert the element back into the queue
        }
        System.out.println();
    }

    public static void reverseK(int k, Queue<Integer> q) {
        Stack<Integer> st = new Stack<>(); 
        for (int i = 0; i < k; i++) { 
            st.push(q.peek());
            q.poll();
        }
        while (st.size() > 0) {
            q.add(st.peek()); 
            st.pop();
        }
        int n = q.size();
        for (int i = 0; i < n - k; i++) {
            q.add(q.peek());
            q.poll();
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
        display(q);

        int k = 2; 
        reverseK(k, q);
        display(q);
    }
}
