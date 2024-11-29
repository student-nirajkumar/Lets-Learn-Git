import java.util.ArrayList;

public class SubsetDuplicate {
    public static void storeSubstring(String ans, String original, ArrayList<String> ll, boolean flag) {
        if (original.isEmpty()) { 
            ll.add(ans);
            return;
        }

        char ch = original.charAt(0); 
        String rest = original.substring(1); 
        storeSubstring(ans + ch, rest, ll, true);
        if (flag || rest.isEmpty() || rest.charAt(0) != ch) {
            storeSubstring(ans, rest, ll, true);
        }
    }

    public static void main(String[] args) {
        String str = "aab";
        ArrayList<String> ll = new ArrayList<>();
        storeSubstring("", str, ll, true);

        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
    }
}
