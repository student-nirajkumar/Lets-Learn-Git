import java.util.ArrayList;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "egg"; // example input
        String t = "add"; // example input
        
        if (s.length() != t.length()) {
            System.out.println("The strings are not isomorphic.");
            return;
        }

        ArrayList<Integer> v = new ArrayList<>(150);
        for (int i = 0; i < 150; i++) {
            v.add(1000);
        }

        for (int i = 0; i < s.length(); i++) {
            int idx = (int) s.charAt(i);
            if (v.get(idx) == 1000) {
                v.set(idx, s.charAt(i) - t.charAt(i));
            } else if (v.get(idx) != s.charAt(i) - t.charAt(i)) {
                System.out.println("The strings are not isomorphic.");
                return;
            }
        }

        for (int i = 0; i < t.length(); i++) {
            int idx = (int) t.charAt(i);
            if (v.get(idx) == 1000) {
                v.set(idx, t.charAt(i) - s.charAt(i));
            } else if (v.get(idx) != t.charAt(i) - s.charAt(i)) {
                System.out.println("The strings are not isomorphic.");
                return;
            }
        }

        System.out.println("The strings are isomorphic.");
    }
}