// Input: arr[] = [10, 20, 10, 5, 15]
// Output: 10 30 40 45 60
// Explanation: For each index i, add all the elements from 0 to i:
// prefixSum[0] = 10, 
// prefixSum[1] = 10 + 20 = 30, 
// prefixSum[2] = 10 + 20 + 10 = 40 and so on.

import java.util.Scanner;

public class prefixSumArray {
    public static void prefixSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1]; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; 

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        prefixSum(arr); 

        System.out.print("Prefix Sum Array: ");
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

