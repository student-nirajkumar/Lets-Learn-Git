import java.util.ArrayList;
import java.util.Collections;

public class SubsetDuplicate {
    public static void storeSubstring(String ans, String original, ArrayList<String> ll, boolean lastIncluded) {
        if (original.isEmpty()) { 
            if (!ll.contains(ans)) { 
                ll.add(ans);
            }
            return;
        }

        char ch = original.charAt(0); 
        String rest = original.substring(1); 
        storeSubstring(ans + ch, rest, ll, true);
        if (rest.isEmpty() || ch != rest.charAt(0) || !lastIncluded) {
            storeSubstring(ans, rest, ll, false);
        }
    }

    public static void main(String[] args) {
        String str = "aab";

        ArrayList<String> ll = new ArrayList<>();
        char[] chars = str.toCharArray();
        java.util.Arrays.sort(chars); 
        str = new String(chars);

        storeSubstring("", str, ll, false); 
        Collections.sort(ll);
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
    }
}
