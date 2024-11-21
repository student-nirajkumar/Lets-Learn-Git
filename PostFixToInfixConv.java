
    import java.util.Stack;
    public class PostFixToInfixConv {
    public static String postfixToInfix(String expression) {
        Stack<String> stack = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            } else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String infix = "(" + operand1 + ch + operand2 + ")";
                stack.push(infix);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "ab+c*d+";
        System.out.println("Infix expression: " + postfixToInfix(postfix));
    }
}
