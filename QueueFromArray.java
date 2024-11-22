
    import java.util.LinkedList;
import java.util.Queue;

public class QueueFromArray {
    static class Queue {
        int f;
        int b;
        int[] arr = new int[5];

        Queue() {
            f = 0;
            b = 0;
        }

        void add(int val) {
            if (b == 5) {
                System.out.println("Queue is full!");
                return;
            }
            arr[b] = val;
            b++;
        }

        void poll() {
            if (f == b) {
                System.out.println("Queue is empty!");
                return;
            }
            f++;
        }

        int peek() {
            if (f == b) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[f];
        }

        int back() {
            if (f == b) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[b - 1];
        }

        int size() {
            return b - f;
        }

        boolean empty() {
            return f == b;
        }

        void display() {
            for (int i = f; i < b; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        q.add(50);
        q.add(60);
        q.display();
        q.poll();
        q.display();
    }
}

    

