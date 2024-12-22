public class SquareOfsortedArray {
        public static void main(String[] args) {
            int[] nums = {-7, -3, 2, 3, 11};
            int[] result = sortedSquares(nums);
    
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }
    
        public static int[] sortedSquares(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];
            int left = 0, right = n - 1, index = n - 1;
    
            for (; left <= right; ) {
                int leftSquare = nums[left] * nums[left];
                int rightSquare = nums[right] * nums[right];
                if (leftSquare > rightSquare) {
                    result[index--] = leftSquare;
                    left++;
                } else {
                    result[index--] = rightSquare;
                    right--;
                }
            }
    
            return result;
        }
    }