//problem no -01

import java.util.*;
public class Problem1 {

        public static int findMiddleIndex(int[] nums) {
            int totalSum = 0, leftSum = 0;
            for (int num : nums) {
                totalSum += num;
            }
            for (int i = 0; i < nums.length; i++) {
                
                if (leftSum == (totalSum - leftSum - nums[i])) {
                    return i; 
                }
                leftSum += nums[i];
            }
    
            return -1; 
        }
    
        public static void main(String[] args) {
            
            int[] nums = {1, 7, 3, 6, 5, 6};
    
            int result = findMiddleIndex(nums);
    
            if (result != -1) {
                System.out.println("The leftmost middleIndex is: " + result);
            } else {
                System.out.println("No balance point found. Task is impossible.");
            }
        }
    }
    
    
// Time complexity = O(n);
//Space Complexity = O(1);


// Dry run
// nums = {2, 3, -1, 8, 4}:

// totalSum = 2 + 3 - 1 + 8 + 4 = 16.
// Iterate through the array:
// i = 0: leftSum = 0, rightSum = 16 - 0 - 2 = 14 (false).
// i = 1: leftSum = 2, rightSum = 16 - 2 - 3 = 11 (false).
// i = 2: leftSum = 5, rightSum = 16 - 5 - (-1) = 10 (false).
// i = 3: leftSum = 4, rightSum = 16 - 4 - 8 = 4 (true).
// Output: "The leftmost middleIndex is: 3".