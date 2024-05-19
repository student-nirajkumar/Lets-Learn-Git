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
/*import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        String str = "ab";
        int n = str.length();
        int maxcount = 1; // Initialize maxcount to 1

        for (int i = 0; i < n; i++) {
           // char ch=str.charAt(i);
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(count > maxcount) {
                maxcount = count; 
            }
        }
        
        for (int i = 0; i < n; i++) {
            int count = 1;
            char ch=str.charAt(i);
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(count == maxcount){ 
                System.out.println("the max count of "+ch+" is:" +maxcount);
            }
        }
    }
}*/


// EFFICIENT WAY TO HANDELE THIS PROGRAMM 
/*import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "raghav";
        int[] arr = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;
            arr[ascii - 97]++;
        }
        
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                int ascii = i + 97;
                char ch = (char) ascii;
                System.out.println(ch + " " + max);
            }
        }
    }
}
 */
