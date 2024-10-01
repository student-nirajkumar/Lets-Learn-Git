import java.util.Stack;

public class RemoveConsecutiveDuplicate {

    public static String removeDuplicates(String s) {
        if (s.isEmpty()) return s;  
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != st.peek()) {
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aaabbcddaabffg";
        System.out.println("Original String: " + s);
        s = removeDuplicates(s);
        System.out.println("After removing consecutive duplicates: " + s);
    }
}
