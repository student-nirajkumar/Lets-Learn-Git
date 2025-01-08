public class ContiguousSubArray {
    public static void main(String[] args) {
        int[] arr = {4, -6, 2, 8}; 
        int n = arr.length;
        int max = Integer.MIN_VALUE; 
       // O(n3)
        for (int i = 0; i < n; i++) {
             for (int j = i; j < n; j++) {
                int sum = 0;
                 for (int k = i; k <= j; k++) { 
                     sum += arr[k];
                }
                max = Math.max(max, sum); 
             }
    }
        
         System.out.println("Maximum sum of a contiguous subarray is: " + max);
    }
}
// //O(n2)
// public class ContiguousSubArray {
//     public static void main(String[] args) {
//         int[] arr = {4, -6, 2, 8}; 
//         int n = arr.length;
//         int max = Integer.MIN_VALUE; 

//         for (int i = 0; i < n; i++) {
//             int sum = 0; 
//             for (int j = i; j < n; j++) {
//                 sum += arr[j]; 
//                 max = Math.max(max, sum); 
//             }
//         }

//         System.out.println("Maximum sum of a contiguous subarray is: " + max);
//     }
//    }
