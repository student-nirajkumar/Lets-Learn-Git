public class InputStringTocount {
    public static void main (String args[]) {
        String str1 = "abbcdeffghh";
        int count = 0;
        int n = str1.length();

        for (int i = 0; i < n; i++) {
            if (n == 1) break;
            if (n == 2 && str1.charAt(0) != str1.charAt(1)) {
                count = 1;
                break;
            }
            if (i == 0) {
                if (str1.charAt(i) != str1.charAt(i + 1)) count++;
            } else if (i == n - 1) {
                if (str1.charAt(i) != str1.charAt(i - 1)) count++;
            } else {
                if (str1.charAt(i) != str1.charAt(i + 1) && str1.charAt(i) != str1.charAt(i - 1)) count++;
            }
        }

        System.out.print("The number of different neighbouring characters in the given string is " + count);
    }
}
