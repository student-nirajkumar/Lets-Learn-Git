import java.util.ArrayList;

public class SubsetOfArray {
    public static void printSubset(int[] arr, int n, int idx, ArrayList<Integer> ll) {
        if (idx == n) {
            for (int i = 0; i < ll.size(); i++) {
                System.out.print(ll.get(i) + " ");
            }
            System.out.println();
            return;
        }
        printSubset(arr, n, idx + 1, ll);
        ll.add(arr[idx]);
        printSubset(arr, n, idx + 1, ll);
        ll.remove(ll.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        ArrayList<Integer> ll = new ArrayList<>();
        printSubset(arr, n, 0, ll);
    }
}
