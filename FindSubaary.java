public class FindSubaary {
    public static void main(String[] args) {
        int arr[]= {4,3,7,2};
        int n= arr.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j ; k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    }
    
}
// public class Subarrays {
//     public static void printSubarrays(int[] arr) {
//         int n = arr.length;
        
//         // Outer loop for the starting index of subarrays
//         for (int i = 0; i < n; i++) {
//             // Inner loop for the ending index of subarrays
//             for (int j = i; j < n; j++) {
//                 // Print the subarray from i to j
//                 System.out.print(arr[j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};
//         printSubarrays(arr);
//     }
// }
