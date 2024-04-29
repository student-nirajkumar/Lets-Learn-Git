import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3 {
    public static List<List<Integer>> triplet(int n, List<Integer> nums) {
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums.get(i) + nums.get(j) + nums.get(k);
                    if (sum == 0) {
                        List<Integer> temp = new ArrayList<>(); 
                        temp.add(nums.get(i));
                        temp.add(nums.get(j));
                        temp.add(nums.get(k));
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    public static void main(String[] args) {
        int n = 6;
        List<Integer> nums = Arrays.asList(-1, 0, 1, 2, -1, -4);
        List<List<Integer>> result = triplet(n, nums);
        System.out.println(result);
    }
}
