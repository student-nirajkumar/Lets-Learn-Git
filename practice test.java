//1. Running Sum of 1D Array
import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt(); 
            }
            for (int i = 1; i < n; i++) {
                nums[i] += nums[i - 1];
            }
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
//2 Find the Highest Altitude
import java.util.Scanner;

public class HighestAltitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] gain = new int[n];
            for (int i = 0; i < n; i++) {
                gain[i] = sc.nextInt(); 
            }
            int altitude = 0, maxAltitude = 0;
            for (int g : gain) {
                altitude += g;
                maxAltitude = Math.max(maxAltitude, altitude);
            }
            System.out.println(maxAltitude);
        }
        sc.close();
    }
}
//3. Minimum Value to Get Positive Step by Step Sum
import java.util.Scanner;

public class MinimumStartValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt(); 
            }
            int sum = 0, minSum = Integer.MAX_VALUE;
            for (int num : nums) {
                sum += num;
                minSum = Math.min(minSum, sum);
            }
            System.out.println(minSum < 0 ? -minSum + 1 : 1);
        }
        sc.close();
    }
}
 //4. Range Sum Query - Immutable
 import java.util.Scanner;

public class NumArray {
    private int[] prefixSum;

    public NumArray(int[] nums) {
        prefixSum = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return prefixSum[j + 1] - prefixSum[i];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt(); 
            }
            NumArray obj = new NumArray(nums);
            int q = sc.nextInt(); 
            while (q-- > 0) {
                int i = sc.nextInt();
                int j = sc.nextInt();
                System.out.println(obj.sumRange(i, j));
            }
        }
        sc.close();
    }
}
  //5. Maximum Score After Splitting a String import java.util.Scanner;

public class MaxScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next(); 
            int leftScore = 0, rightScore = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    rightScore++;
                }
            }
            int maxScore = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '0') {
                    leftScore++;
                } else {
                    rightScore--;
                }
                maxScore = Math.max(maxScore, leftScore + rightScore);
            }
            System.out.println(maxScore);
        }
        sc.close();
    }
}
// 7. Matrix Block Sum import java.util.Scanner;

public class MatrixBlockSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int m = sc.nextInt(), n = sc.nextInt(), k = sc.nextInt();
            int[][] mat = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = sc.nextInt(); 
                }
            }
            int[][] prefixSum = new int[m + 1][n + 1];
            int[][] result = new int[m][n];
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    prefixSum[i][j] = mat[i - 1][j - 1] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int r1 = Math.max(i - k, 0), r2 = Math.min(i + k + 1, m);
                    int c1 = Math.max(j - k, 0), c2 = Math.min(j + k + 1, n);
                    result[i][j] = prefixSum[r2][c2] - prefixSum[r1][c2] - prefixSum[r2][c1] + prefixSum[r1][c1];
                }
            }
            for (int[] row : result) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
//8. Sum of Absolute Differences in a Sorted Array import java.util.Scanner;
import java.util.Arrays;

public class AbsoluteDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt(); 
            }
            Arrays.sort(nums); 
            long totalSum = 0;
            long prefixSum = 0;
            for (int i = 0; i < n; i++) {
                totalSum += (nums[i] * i - prefixSum);
                prefixSum += nums[i];
            }
            System.out.println((int)(totalSum % (1e9 + 7)));
        }
        sc.close();
    }
}
//9. Product of Array Except for Self import java.util.Scanner;

public class ProductExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt(); 
            }

            int[] left = new int[n];
            int[] right = new int[n];
            int[] result = new int[n];

            left[0] = 1;
            for (int i = 1; i < n; i++) {
                left[i] = left[i - 1] * nums[i - 1];
            }

            right[n - 1] = 1;
            for (int i = n - 2; i >= 0; i--) {
                right[i] = right[i + 1] * nums[i + 1];
            }

            for (int i = 0; i < n; i++) {
                result[i] = left[i] * right[i];
            }

            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
//10. Shifting Letters import java.util.Scanner;

public class ShiftingLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            String s = sc.next(); 
            int n = s.length();
            int[] shifts = new int[n];
            for (int i = 0; i < n; i++) {
                shifts[i] = sc.nextInt(); 
            }

            long totalShift = 0;
            for (int i = n - 1; i >= 0; i--) {
                totalShift += shifts[i];
                shifts[i] = (shifts[i] + totalShift) % 26; 
            }

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                char shiftedChar = (char) ((s.charAt(i) - 'a' + shifts[i]) % 26 + 'a');
                result.append(shiftedChar); 
            }
            System.out.println(result);
        }
        sc.close();
    }
}
