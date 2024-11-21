
    import java.util.Stack;
    public class PostfixEvalution {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                
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
        String expression = "23*54*+9-";
        System.out.println("Postfix evaluation result: " + evaluatePostfix(expression));
    }
}
