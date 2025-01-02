import java.util.*;

public class CollectingCnadies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); 
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 0; i < N; i++) {
                pq.add(sc.nextInt());
            }

            long totalTime = 0;
            while (pq.size() > 1) {
                int first = pq.poll();
                int second = pq.poll();
                int mergeTime = first + second;
                totalTime += mergeTime;
                pq.add(mergeTime);
            }
            System.out.println(totalTime);
        }
    }
}


