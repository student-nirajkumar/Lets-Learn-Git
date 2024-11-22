
    import java.util.ArrayList;

    public class MissingReapting {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        int[] count = new int[n + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int repeating = -1, missing = -1;
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                repeating = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        result.add(repeating);
        result.add(missing);
        return result;
    }

    public static void main(String[] args) {
        MissingReapting solution = new  MissingReapting();
        int[] arr = {4, 3, 6, 2, 1, 1};
        ArrayList<Integer> result = solution.findTwoElement(arr);
        System.out.println("Repeating: " + result.get(0));
        System.out.println("Missing: " + result.get(1));
    }
} 

    

