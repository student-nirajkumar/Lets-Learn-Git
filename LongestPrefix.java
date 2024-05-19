import java.util.*;

public class LongestPrefix {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("flower");
        str.add("flow");
        str.add("flight");
        str.add("roots");

        if (str.size() == 0) {
            System.out.println("");
            return;
        }
        if (str.size() == 1) {
            System.out.println(str.get(0));
            return;
        }

        Collections.sort(str);
        String first = str.get(0);
        String last = str.get(str.size() - 1);
        String s = "";

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                s += first.charAt(i);
            } else {
                break; // Break the loop when characters don't match
            }
        }

        if (s.isEmpty()) {
            System.out.println("No common prefix");
        } else {
            System.out.println(s);
        }
    }
}
