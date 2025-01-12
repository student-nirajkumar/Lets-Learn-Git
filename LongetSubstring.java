
    import java.util.HashSet;

    public class LongetSubstring {
    public static void main(String[] args) {
        LongetSubstring solution = new LongetSubstring();
        String s = "abcabcbb";
        System.out.println(solution.longestUniqueSubstr(s));
    }

    public int longestUniqueSubstr(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isdiffchar(arr, i, j)) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }

    public static boolean isdiffchar(char[] arr, int low, int high) {
        HashSet<Character> set = new HashSet<>();
        for (int k = low; k <= high; k++) {
            if (set.contains(arr[k])) {
                return false;
            }
            set.add(arr[k]);
        }
        return true;
    }
}

    

