import java.util.ArrayList;
import java.util.List;

public class TwoSneakyNo {
    public static int[] getSneakyNumbers(int[] nums) {
        List<Integer> sneakyNumbers = new ArrayList<>();
        int[] count = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 2) {
                sneakyNumbers.add(i);
            }
        }

        int[] result = new int[2];
        result[0] = sneakyNumbers.get(0);
        result[1] = sneakyNumbers.get(1);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0};
        int[] result = getSneakyNumbers(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

    
