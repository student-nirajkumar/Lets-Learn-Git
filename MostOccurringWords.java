import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class MostOccurringWords {
    public static void main(String[] args) {
        String str = "reghav is maths mentor as well as dsa techers in pw skiils";
        StringTokenizer str1 = new StringTokenizer(str);
        String temp;
        ArrayList<String> str2 = new ArrayList<>();
        while (str1.hasMoreTokens()) {
            temp = str1.nextToken();
            str2.add(temp);
        }
        Collections.sort(str2);
        int maxcount = 1;
        int count = 1;
        for (int i = 1; i < str2.size(); i++) {
            if (str2.get(i - 1).equals(str2.get(i))) 
                count++;
            else {
                count = 1;
            }
            maxcount = Math.max(maxcount, count);
        }

        count = 1;
        for (int i = 1; i < str2.size(); i++) {
            if (str2.get(i - 1).equals(str2.get(i))) 
                count++;
            else {
                count = 1;
            }

            if (count == maxcount) {
                System.out.print(str2.get(i) + " " + maxcount + "\n");
            }
        }
    }
}
