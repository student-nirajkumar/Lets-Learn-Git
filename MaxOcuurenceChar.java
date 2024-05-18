import java.util.ArrayList;

class MaxOccurenceChar
 {
    public static void main(String[] args) {
        String str = "aa ccc bbb";
        int n = str.length();
        int maxcount = 0;
        ArrayList<Character> maxChars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > maxcount) {
                maxcount = count;
                maxChars.clear();
                maxChars.add(str.charAt(i));
            } else if (count == maxcount) {
                maxChars.add(str.charAt(i));
            }
        }

        if (maxcount == 1) {
            System.out.print("All characters occur one time each.");
        } else {
            System.out.print("The character(s) ");
            for (char c : maxChars) {
                System.out.print("'" + c + "', ");
            }
            System.out.println("occur(s) the most with " + maxcount + " times.");
        }
    }
}
