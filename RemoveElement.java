public class RemoveElement {
        public int removeElement(int[] nums, int val) {
            int i = 0; 
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[i] = nums[j];  
                    i++; 
                }
            }
            return i;  
        }
    
        public static void main(String[] args) {
            RemoveElement solution = new RemoveElement();
    
            int[] nums = {3, 2, 2, 3};
            int val = 3;
    
            int newLength = solution.removeElement(nums, val);
    
            System.out.println("New length: " + newLength);
            System.out.print("Modified array: ");
            for (int i = 0; i < newLength; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }
    

