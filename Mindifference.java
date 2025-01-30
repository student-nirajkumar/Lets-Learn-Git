
    import java.util.Arrays;

    public class Mindifference {
    int minDiff(int[] arr, int k, int m, int th) {
        Arrays.sort(arr);
        int n = arr.length;
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int minVal = arr[i];
            int maxVal = arr[i + k - 1];
            int count = 0;

            for (int j = i; j < i + k; j++) {
                if (arr[j] >= th) {
                    count++;
                }
            }

            if (count >= m) {
                minDifference = Math.min(minDifference, maxVal - minVal);
            }
        }

        if (minDifference == Integer.MAX_VALUE) {
            return -1;
        }
        return minDifference;
    }

    public static void main(String[] args) {
        Mindifference sol = new Mindifference();
        int[] arr = {4, 1, 7, 5, 3, 8, 6};
        int k = 3, m = 1, t = 5;
        System.out.println(sol.minDiff(arr, k, m, t));
    }
}

    
