// 1. Binary Search  import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }
            int target = sc.nextInt(); 

            int result = binarySearch(arr, target);
            System.out.println(result);
        }
        sc.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // Not found
    }
}
// 2. Search Insert Position  import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }
            int target = sc.nextInt(); 

            int result = searchInsert(arr, target);
            System.out.println(result);
        }
        sc.close();
    }

    public static int searchInsert(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return left; // Insert position
    }
}
  //3. Count Negative Numbers in a Sorted Matrix
  import java.util.Scanner;

  public class CountNegativeNumbers {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int t = sc.nextInt(); 
          while (t-- > 0) {
              int m = sc.nextInt(), n = sc.nextInt(); 
              int[][] matrix = new int[m][n];
              for (int i = 0; i < m; i++) {
                  for (int j = 0; j < n; j++) {
                      matrix[i][j] = sc.nextInt(); 
                  }
              }
  
              int count = 0;
              for (int i = 0; i < m; i++) {
                  int left = 0, right = n - 1;
                  while (left <= right) {
                      int mid = left + (right - left) / 2;
                      if (matrix[i][mid] < 0) {
                          count += (right - mid + 1);
                          right = mid - 1;
                      } else {
                          left = mid + 1;
                      }
                  }
              }
              System.out.println(count);
          }
          sc.close();
      }
  }
//4. Special Array With X Elements Greater Than or Equal X  import java.util.Scanner;

public class SpecialArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int result = specialArray(arr);
            System.out.println(result);
        }
        sc.close();
    }

    public static int specialArray(int[] arr) {
        int left = 1, right = arr.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int num : arr) {
                if (num >= mid) count++;
            }
            if (count == mid) return mid;
            else if (count < mid) right = mid - 1;
            else left = mid + 1;
        }
        return -1; 
    }
}
// 5. Kth Missing Positive Number  import java.util.Scanner;

public class KthMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }
            int k = sc.nextInt(); 

            int result = findKthMissing(arr, k);
            System.out.println(result);
        }
        sc.close();
    }

    public static int findKthMissing(int[] arr, int k) {
        int left = 0, right = arr.length, missing = 0;
        while (left < right) {
            int mid = left + (right - left) / 2;
            missing = arr[mid] - (mid + 1);
            if (missing < k) left = mid + 1;
            else right = mid;
        }
        return left + k;
    }
}
//6. The K Weakest Rows in a Matrix  import java.util.Scanner;

public class KWeakestRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int m = sc.nextInt(), n = sc.nextInt(); 
            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt(); 
                }
            }
            int k = sc.nextInt(); 

            int[] result = kWeakestRows(matrix, k);
            for (int row : result) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static int[] kWeakestRows(int[][] matrix, int k) {
        int[] count = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int left = 0, right = matrix[i].length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (matrix[i][mid] == 1) left = mid + 1;
                else right = mid - 1;
            }
            count[i] = left;
        }
        int[] result = new int[k];
        return result;
    }
}
// 7. Arranging Coins  import java.util.Scanner;

public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int result = arrangeCoins(n);
            System.out.println(result);
        }
        sc.close();
    }

    public static int arrangeCoins(int n) {
        int left = 0, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int coinsUsed = (mid * (mid + 1)) / 2;
            if (coinsUsed == n) return mid;
            else if (coinsUsed < n) left = mid + 1;
            else right = mid - 1;
        }
        return right;
    }
}
// 8. First Bad Version  import java.util.Scanner;

public class FirstBadVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int bad = sc.nextInt(); 

            int result = firstBadVersion(n, bad);
            System.out.println(result);
        }
        sc.close();
    }

    public static int firstBadVersion(int n, int bad) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid, bad)) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    public static boolean isBadVersion(int version, int bad) {
        return version >= bad;
    }
}
// 9. Valid Perfect Square  import java.util.Scanner;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int num = sc.nextInt(); 

            boolean result = isPerfectSquare(num);
            System.out.println(result);
        }
        sc.close();
    }

    public static boolean isPerfectSquare(int num) {
        long left = 1, right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sqr = mid * mid;
            if (sqr == num) return true;
            else if (sqr < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}

//10. Sqrt(x) import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int x = sc.nextInt(); 

            int result = mySqrt(x);
            System.out.println(result);
        }
        sc.close();
    }

    public static int mySqrt(int x) {
        int left = 0, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sqr = (long) mid * mid;
            if (sqr == x) return mid;
            else if (sqr < x) left = mid + 1;
            else right = mid - 1;
        }
        return right;
    }
}
// 11. Magnetic Force Between Two Balls import java.util.Arrays;
import java.util.Scanner;

public class MagneticForceBetweenTwoBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 
            int[] positions = new int[n];
            for (int i = 0; i < n; i++) {
                positions[i] = sc.nextInt(); 
            }

            int result = maxDistance(positions, k);
            System.out.println(result);
        }
        sc.close();
    }

    public static int maxDistance(int[] positions, int k) {
        Arrays.sort(positions); 

        int left = 1, right = positions[positions.length - 1] - positions[0];
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canPlace(positions, k, mid)) left = mid + 1;
            else right = mid;
        }
        return left - 1;
    }

    public static boolean canPlace(int[] positions, int k, int distance) {
        int count = 1, lastPosition = positions[0];
        for (int i = 1; i < positions.length; i++) {
            if (positions[i] - lastPosition >= distance) {
                count++;
                lastPosition = positions[i];
                if (count >= k) return true;
            }
        }
        return false;
    }
}
// 12. Capacity to Ship Packages Within D Days  import java.util.Scanner;

public class CapacityToShipPackages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(), d = sc.nextInt(); 
            int[] weights = new int[n];
            for (int i = 0; i < n; i++) {
                weights[i] = sc.nextInt(); 
            }

            int result = shipWithinDays(weights, d);
            System.out.println(result);
        }
        sc.close();
    }

    public static int shipWithinDays(int[] weights, int d) {
        int left = 0, right = 0;
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, mid, d)) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    public static boolean canShip(int[] weights, int capacity, int days) {
        int dayCount = 1, currentWeight = 0;
        for (int weight : weights) {
            if (currentWeight + weight > capacity) {
                dayCount++;
                currentWeight = weight;
                if (dayCount > days) return false;
            } else {
                currentWeight += weight;
            }
        }
        return true;
    }
}
//13. Peak Index in a Mountain Array import java.util.Scanner;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }

            int result = peakIndexInMountainArray(arr);
            System.out.println(result);
        }
        sc.close();
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
// 14. Find the Smallest Divisor Given a Threshold  import java.util.Scanner;

public class SmallestDivisorGivenThreshold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }
            int threshold = sc.nextInt(); 

            int result = smallestDivisor(arr, threshold);
            System.out.println(result);
        }
        sc.close();
    }

    public static int smallestDivisor(int[] arr, int threshold) {
        int left = 1, right = 1000000;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int sum = 0;
            for (int num : arr) {
                sum += (num + mid - 1) / mid;
            }
            if (sum > threshold) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
// 15. Minimum Limit of Balls in a Bag import java.util.Scanner;

public class MinimumLimitOfBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int maxOperations = sc.nextInt(); 

            int result = minimumSize(nums, maxOperations);
            System.out.println(result);
        }
        sc.close();
    }

    public static int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = 0;
        for (int num : nums) {
            right = Math.max(right, num);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            int operations = 0;
            for (int num : nums) {
                operations += (num - 1) / mid;
            }
            if (operations > maxOperations) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
//16. Single Element in a Sorted Array  import java.util.Scanner;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }

            int result = singleNonDuplicate(arr);
            System.out.println(result);
        }
        sc.close();
    }

    public static int singleNonDuplicate(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) mid--;
            if (arr[mid] == arr[mid + 1]) left = mid + 2;
            else right = mid;
        }
        return arr[left];
    }
}
//17. Most Profit Assigning Work import java.util.Arrays;
import java.util.Scanner;

public class MostProfitAssigningWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] difficulty = new int[n];
            int[] profit = new int[n];
            for (int i = 0; i < n; i++) {
                difficulty[i] = sc.nextInt(); 
            }
            for (int i = 0; i < n; i++) {
                profit[i] = sc.nextInt(); 
            }
            int m = sc.nextInt();
            int[] worker = new int[m];
            for (int i = 0; i < m; i++) {
                worker[i] = sc.nextInt(); 
            }

            int result = maxProfitAssignment(difficulty, profit, worker);
            System.out.println(result);
        }
        sc.close();
    }

    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[] jobs = new int[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = profit[i];
        }
        Arrays.sort(difficulty);
        Arrays.sort(worker);

        int maxProfit = 0, maxProfitAtJob = 0, j = 0;
        for (int i = 0; i < worker.length; i++) {
            while (j < n && worker[i] >= difficulty[j]) {
                maxProfitAtJob = Math.max(maxProfitAtJob, jobs[j]);
                j++;
            }
            maxProfit += maxProfitAtJob;
        }
        return maxProfit;
    }
}
//18. Search a 2D Matrix import java.util.Scanner;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int m = sc.nextInt(), n = sc.nextInt();
            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt(); 
                }
            }
            int target = sc.nextInt(); 

            boolean result = searchMatrix(matrix, target);
            System.out.println(result);
        }
        sc.close();
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] < target) row++;
            else col--;
        }
        return false;
    }
}
//19. Search a 2D Matrix II  import java.util.Scanner;

public class SearchA2DMatrixII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int m = sc.nextInt(), n = sc.nextInt(); 
            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            int target = sc.nextInt(); 

            boolean result = searchMatrix(matrix, target);
            System.out.println(result);
        }
        sc.close();
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] < target) row++;
            else col--;
        }
        return false;
    }
}
// 20. Valid Triangle Number  import java.util.Arrays;
import java.util.Scanner;

public class ValidTriangleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt(); 
            }

            int result = triangleNumber(nums);
            System.out.println(result);
        }
        sc.close();
    }

    public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] > nums[right]) {
                    count += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;
    }
}


//21. Find Minimum in Rotated Sorted Array import java.util.Scanner;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }

            int result = findMin(arr);
            System.out.println(result);
        }
        sc.close();
    }

    public static int findMin(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) left = mid + 1;
            else right = mid;
        }
        return arr[left];
    }
}
// 22. Random Pick with Weight import java.util.Scanner;
import java.util.Random;

public class RandomPickWithWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] w = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = sc.nextInt(); 
            }

            RandomPickWithWeight obj = new RandomPickWithWeight(w);
            System.out.println(obj.pickIndex()); 
        }
        sc.close();
    }

    private int[] prefixSum;

    public RandomPickWithWeight(int[] w) {
        int n = w.length;
        prefixSum = new int[n];
        prefixSum[0] = w[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + w[i];
        }
    }

    public int pickIndex() {
        Random rand = new Random();
        int target = rand.nextInt(prefixSum[prefixSum.length - 1]) + 1;
        int left = 0, right = prefixSum.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (prefixSum[mid] < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
//23. Find Peak Element import java.util.Scanner;

public class FindPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }

            int result = findPeakElement(arr);
            System.out.println(result);
        }
        sc.close();
    }

    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
// 24. Find First and Last Position of Element in Sorted Array import java.util.Scanner;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }
            int target = sc.nextInt(); 
            int[] result = searchRange(arr, target);
            System.out.println(result[0] + " " + result[1]);
        }
        sc.close();
    }

    public static int[] searchRange(int[] arr, int target) {
        int[] result = {-1, -1};
        result[0] = binarySearch(arr, target, true);
        if (result[0] != -1) {
            result[1] = binarySearch(arr, target, false);
        }
        return result;
    }

    public static int binarySearch(int[] arr, int target, boolean isLeft) {
        int left = 0, right = arr.length - 1, res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                res = mid;
                if (isLeft) right = mid - 1;
                else left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return res;
    }
}
//25. Search in Rotated Sorted Array  import java.util.Scanner;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }
            int target = sc.nextInt();

            int result = search(arr, target);
            System.out.println(result);
        }
        sc.close();
    }

    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[left] <= arr[mid]) {
                if (arr[left] <= target && target < arr[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (arr[mid] < target && target <= arr[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
}
// 26. Minimum Number of Days to Make m Bouquets import java.util.Scanner;

public class MinimumNumberOfDaysToMakeBouquets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 
            int[] bloomDay = new int[n];
            for (int i = 0; i < n; i++) {
                bloomDay[i] = sc.nextInt(); 
            }

            int result = minDays(bloomDay, m);
            System.out.println(result);
        }
        sc.close();
    }

    public static int minDays(int[] bloomDay, int m) {
        if (bloomDay.length < m) return -1;

        int left = 1, right = Integer.MAX_VALUE;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canMakeBouquets(bloomDay, mid, m)) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    public static boolean canMakeBouquets(int[] bloomDay, int day, int m) {
        int bouquets = 0, flowers = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                flowers++;
                if (flowers == 3) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
}
//27. H-Index II  import java.util.Scanner;

public class HIndexII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] citations = new int[n];
            for (int i = 0; i < n; i++) {
                citations[i] = sc.nextInt(); 
            }

            int result = hIndex(citations);
            System.out.println(result);
        }
        sc.close();
    }

    public static int hIndex(int[] citations) {
        int left = 0, right = citations.length - 1, n = citations.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (citations[mid] == n - mid) return citations[mid];
            else if (citations[mid] < n - mid) left = mid + 1;
            else right = mid - 1;
        }
        return n - left;
    }
}
//28. Sum of Square Numbers import java.util.Scanner;

public class SumOfSquareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int c = sc.nextInt(); 

            boolean result = judgeSquareSum(c);
            System.out.println(result);
        }
        sc.close();
    }

    public static boolean judgeSquareSum(int c) {
        for (int a = 0; a * a <= c; a++) {
            int b = (int) Math.sqrt(c - a * a);
            if (a * a + b * b == c) return true;
        }
        return false;
    }
}
// 29. Maximum Running Time of N Computers import java.util.Scanner;

public class MaximumRunningTimeOfNComputers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 
            int[] time = new int[m];
            for (int i = 0; i < m; i++) {
                time[i] = sc.nextInt(); 
            }

            long result = maxRunTime(n, time);
            System.out.println(result);
        }
        sc.close();
    }

    public static long maxRunTime(int n, int[] time) {
        long left = 0, right = 0;
        for (int t : time) right += t;

        while (left < right) {
            long mid = left + (right - left + 1) / 2;
            if (canRun(time, n, mid)) left = mid;
            else right = mid - 1;
        }
        return left;
    }

    public static boolean canRun(int[] time, int n, long mid) {
        long totalTime = 0;
        int count = 1;
        for (int t : time) {
            totalTime += t;
            if (totalTime > mid) {
                count++;
                totalTime = t;
            }
        }
        return count <= n;
    }
}
// 30. Find Minimum in Rotated Sorted Array II   import java.util.Scanner;

public class FindMinimumInRotatedSortedArrayII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }

            int result = findMin(arr);
            System.out.println(result);
        }
        sc.close();
    }

    public static int findMin(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[right]) right = mid;
            else if (arr[mid] > arr[right]) left = mid + 1;
            else right--;
        }
        return arr[left];
    }
}
