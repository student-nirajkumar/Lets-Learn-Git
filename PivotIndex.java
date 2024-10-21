public class PivotIndex {
        public int pivotIndex(int[] nums) {
            int total = 0;
            for (int i = 0; i < nums.length; i++) {
                total += nums[i];
            }
            int leftsum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (2 * leftsum + nums[i] == total) {
                    return i;
                }
                leftsum += nums[i];
            }
            return -1;
        }
    
        public static void main(String[] args) {
            PivotIndex solution = new PivotIndex();
            int[] nums1 = {1, 7, 3, 6, 5, 6};
            System.out.println("Pivot index of nums1: " + solution.pivotIndex(nums1)); 
            int[] nums2 = {1, 2, 3};
            System.out.println("Pivot index of nums2: " + solution.pivotIndex(nums2)); 
    
            int[] nums3 = {2, 1, -1};
            System.out.println("Pivot index of nums3: " + solution.pivotIndex(nums3));
    
            int[] nums4 = {-1, -1, -1, -1, -1, 0};
            System.out.println("Pivot index of nums4: " + solution.pivotIndex(nums4)); 
        }
    }
    
    

