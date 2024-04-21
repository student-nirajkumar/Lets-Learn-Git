
    import java.util.PriorityQueue;
    public class MinCostRop {
    long minCost(long arr[], int n) {
        if (arr.length == 1) {
            return 0;
        }
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }
        long res = 0;
        while (pq.size() > 1) {
            long first = pq.poll();
            long second = pq.poll();
            long m = first + second;
            res += m;
            pq.add(m);
        }
        return res;
    }

    public static void main(String[] args) {
        MinCostRop solution = new MinCostRop();
        long[] arr = {4, 3, 2, 6};
        int n = arr.length;
        long minCost = solution.minCost(arr, n);
        System.out.println("Minimum cost: " + minCost);
    }
}

    

