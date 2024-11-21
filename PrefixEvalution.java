
    import java.util.Stack;

    public class PrefixEvalution {
    public static int evaluatePrefix(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);
            if (ch == ' ') continue;
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); 
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                if (ch == '+') {
                    stack.push(operand1 + operand2);
                } else if (ch == '-') {
                    stack.push(operand1 - operand2);
                } else if (ch == '*') {
                    stack.push(operand1 * operand2);
                } else if (ch == '/') {
                    stack.push(operand1 / operand2);
                }
            }
        }
    return stack.pop();
    }

    public static void main(String[] args) {
        String prefixExp = "+ 3 * 5 6";
        int result = evaluatePrefix(prefixExp);
        System.out.println("Result of prefix evaluation: " + result);
    }
}

    

