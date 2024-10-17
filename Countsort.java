
    import java.util.Arrays;
    public class Countsort {
    public void sort012(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count0++;
            else if (arr[i] == 1) count1++;
            else count2++;
        }
        int x = count0;
        int y = x + count1;
        int z = y + count2;
        
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = x; i < y; i++) {
            arr[i] = 1;
        }
        for (int i = y; i < z; i++) {
            arr[i] = 2;
        }
    }

    public static void main(String[] args) {
        Countsort solution = new Countsort();
        int[] arr = {0, 2, 1, 2, 0, 1, 2, 0, 1};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        solution.sort012(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}


