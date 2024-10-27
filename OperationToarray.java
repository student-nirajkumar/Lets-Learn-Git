public class OperationToarray {
        public static int[] applyOperations(int[] nums) {
            for (int i = 0; i < nums.length - 1; i++) { 
                if (nums[i] == nums[i + 1]) {
                    nums[i] = nums[i] * 2;
                    nums[i + 1] = 0;
                }
            }
    
            int count = 0;
            int i = 0;
            while (i < nums.length) {
                if (nums[i] > 0) {
                    nums[count] = nums[i];
                    count++;
                }
                i++;
            }
    
            while (count < nums.length) { 
                nums[count] = 0;
                count++;
            }
    
            return nums;
        }
    
        public static void main(String[] args) {
            int[] nums = {2, 2, 0, 4, 4, 8}; 
            int[] result = applyOperations(nums);
    
            System.out.print("Result: ");
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }
    
    

