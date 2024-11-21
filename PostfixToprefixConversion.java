
    import java.util.Stack;

    public class PostfixToprefixConversion {
    public static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }
    public static String postfixToPrefix(String postfix) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char currentChar = postfix.charAt(i);
            if (!isOperator(currentChar)) {
                stack.push(String.valueOf(currentChar));
            } else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String prefix = currentChar + operand1 + operand2;
                stack.push(prefix);
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String postfix = "ab+c*";
        String prefix = postfixToPrefix(postfix);
        System.out.println("Postfix Expression: " + postfix);
        System.out.println("Prefix Expression: " + prefix);
    }
}



