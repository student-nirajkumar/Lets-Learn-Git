public class ConcatenationOfarray {
        public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[2 * n];
            for (int i = 0; i < n; i++) {
                ans[i] = nums[i];
                ans[i + n] = nums[i];
            }
            return ans;
        }
    
        public static void main(String[] args) {
            ConcatenationOfarray solution = new ConcatenationOfarray();
            int[] nums = {1, 2, 3};
            int[] result = solution.getConcatenation(nums);
    
            System.out.print("Concatenated Array: ");
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }
    
    

