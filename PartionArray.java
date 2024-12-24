
    import java.util.*;
    public class PartionArray {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }



    public static void main(String[] args) {
        PartionArray solution = new PartionArray();
        int[] nums = {1, 4, 3, 2};
        int result = solution.arrayPairSum(nums);
        System.out.println(result);
    }
}

    

