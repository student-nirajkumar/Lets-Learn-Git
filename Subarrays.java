import java.util.ArrayList;

public class Subarrays {
    public static void subarray(ArrayList<Integer> ll, int arr[], int n, int idx) {
        if (idx == n) {
            for (int i = 0; i < ll.size(); i++) {
                System.out.print(ll.get(i) + " ");
            }
            System.out.println();
            return;
        }
        subarray(ll, arr, n, idx + 1);
        if (ll.size() == 0 || ll.get(ll.size() - 1) == arr[idx - 1]) {
            ll.add(arr[idx]);
            subarray(ll, arr, n, idx + 1);
            ll.remove(ll.size() - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int n = arr.length;
        ArrayList<Integer> ll = new ArrayList<>();
        subarray(ll, arr, n, 0);
    }
}
