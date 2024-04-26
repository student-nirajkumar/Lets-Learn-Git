import java.util.Arrays;
public class MergedTwoSortedArray {
    public static void main(String args[]) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0;
        while (i < n) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                fixedArray(arr2, m);
            }
            i++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.print(Arrays.toString(arr2));
    
    }

    public static void fixedArray(int arr2[], int m) {
        for (int i = 1; i < m; i++) {
            if (arr2[i] < arr2[i - 1]) {
                int temp = arr2[i];
                arr2[i] = arr2[i - 1];
                arr2[i - 1] = temp;
            }
        }
    }
   
}