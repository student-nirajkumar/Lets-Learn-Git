import java.util.*;

public class Inserduplicate {
    static ArrayList<Integer> duplicateK(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == k) {
                arr.add(i + 1, k);
                i++;
            }
        }
        while (arr.size() > n) {
            arr.remove(arr.size() - 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {7,5,8};
        int k = 8;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        ArrayList<Integer> result = duplicateK(list, k);
        System.out.println(result);
    }
}
