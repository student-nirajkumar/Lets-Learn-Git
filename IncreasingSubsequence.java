import java.util.ArrayList;

public class IncreasingSubsequence {
    public static void printIncreasingSub(int arr[], int n, int idx, ArrayList<Integer> ll, int k) {
        if (idx == n) {
            if (ll.size() == k) { 
                for (int i = 0; i < ll.size(); i++) {
                    System.out.print(ll.get(i) + " ");
                }
                System.out.println();
            }
            return;
        }
        if(ll.size()+(n-idx)<k) return;
        printIncreasingSub(arr, n, idx + 1, ll, k);
        ll.add(arr[idx]);
        printIncreasingSub(arr, n, idx + 1, ll, k);
        ll.remove(ll.size() - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 3;  
        ArrayList<Integer> ll = new ArrayList<>();
        printIncreasingSub(arr, n, 0, ll, k);
    }
}
