import java.util.Stack;

public class InfixEvaluation {
    public static int priority(char ch) {
        if (ch == '+' || ch == '-') return 1;
        else return 2;
    }

    public static int solve(int val1, int val2, char ch) {
        if (ch == '+') return val1 + val2;
        if (ch == '-') return val1 - val2;
        if (ch == '*') return val1 * val2;
        else return val1 / val2;
    }

    public static void main(String[] args) {
        String s = "2+6*4/8-3";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                val.push(ch - '0'); 
            } else {
                while (!op.isEmpty() && priority(ch) <= priority(op.peek())) {
                    char operator = op.pop();
                    int val2 = val.pop();
                    int val1 = val.pop();
                    int ans = solve(val1, val2, operator);
                    val.push(ans);
                }
                op.push(ch);
            }
        }

        while (!op.isEmpty()) {
            char operator = op.pop();
            int val2 = val.pop();
            int val1 = val.pop();
            int ans = solve(val1, val2, operator);
            val.push(ans);
        }

        System.out.print(val.peek());
    }
}
