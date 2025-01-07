// brute force aapraoach

// import java . util.*;
// public class prefixSum {
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };
//         int row = matrix.length;      
//         int col = matrix[0].length;   
//         int[][] prefixSum = new int[row][col]; 

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 int sum = 0; 
//                 for (int p = 0; p <= i; p++) {
//                     for (int q = 0; q <= j; q++) {
//                         sum += matrix[p][q]; 
//                     }
//                 }
//                 prefixSum[i][j] = sum;
//             }
//         }
//         System.out.println("Prefix Sum Matrix:");
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 System.out.print(prefixSum[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// optimal appraoch
public class prefixSum {
    public static void main(String[] args) {
        int matrix[][] = { 
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} 
        };

        int row = matrix.length;
        int col = matrix[0].length;
        int prefixsum[][] = new int[row][col];

        // Apply row-wise prefix sum
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                prefixsum[i][j] += matrix[i][j]; 
            }
        }

        // Apply prefix sum column-wise
        for (int i = 1; i < row; i++) { 
            for (int j = 0; j < col; j++) {
                prefixsum[i][j] += prefixsum[i - 1][j]; 
            }
        }

      
        System.out.println("Prefix Sum Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(prefixsum[i][j] + " "); 
            }
            System.out.println();
        }
    }
}
