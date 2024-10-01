import java.util.ArrayList;

public class SubarraySum {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == s) {
                    a1.add(i + 1);
                    a1.add(j + 1);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        if (!found) a1.add(-1);
        return a1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int n = arr.length;
        int s = 12;
        ArrayList<Integer> result = subarraySum(arr, n, s);
        System.out.println(result);
    }
}
