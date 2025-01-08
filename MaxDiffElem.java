public class MaxDiffElem {
    public static void main(String[] args) {
        int arr[] = {9, 5, 8, 12, 2, 3, 7, 4};
        int prefix = arr[arr.length - 1]; 
        int max = Integer.MIN_VALUE; 
        for (int i = arr.length - 2; i >= 0; i--) {
            max = Math.max(max, prefix - arr[i]);
            if (prefix < arr[i]) {
                prefix = arr[i];
            }
        }
        System.out.print(max + " ");
    }
}
