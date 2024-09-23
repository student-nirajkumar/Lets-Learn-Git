import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();  // This will store the final result
        Set<List<Integer>> st = new HashSet<>();  // Set to avoid duplicate triplets
        
        // Sort the input array to easily sort triplets later
           Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        // Create a triplet list
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        
                        // Add the triplet to the set (set automatically handles duplicates)
                        st.add(temp);
                    }
                }
            }
        }
        
        // Convert set to list
        ans.addAll(st);
        return ans;
    }
    
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        ThreeSum solution = new ThreeSum();
        List<List<Integer>> result = solution.threeSum(nums);
        
        // Normal for loop to print the result
        for (int i = 0; i < result.size(); i++) {
            List<Integer> triplet = result.get(i);
            System.out.println(triplet);
        }
    }
}
