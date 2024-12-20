public class AmountCoins {
    public static int callTarget(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    count++; 
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3}; 
        int target = 5; 

        int x = callTarget(arr, target); 
        System.out.print(x); 
    }
}
