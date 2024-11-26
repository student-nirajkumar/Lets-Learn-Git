import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativesWindow {
    public static void main(String[] args) {
        int arr[] = {3, -4, -7, 30, 7, -9, 2, 1, 6, -1};
        int k = 3;
        int n = arr.length;
        ArrayList<Integer> ll = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) q.add(i);
        }
        int i = 0;
        while (i + k <= n) {
            while (!q.isEmpty() && q.peek() < i) q.poll();
            if (q.isEmpty() || q.peek() >= i + k) {
                ll.add(0);
            } else {
                ll.add(arr[q.peek()]);
            }
            i++;
        }
        for (int j = 0; j < ll.size(); j++) {
            System.out.print(ll.get(j) + " ");
        }
    }
}
