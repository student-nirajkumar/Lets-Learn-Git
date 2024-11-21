import java.util.Stack;
public class InfixToPostfixConversion {
    public static int priority(char ch) {
        if (ch == '+' || ch == '-') return 1;
        else if (ch == '*' || ch == '/') return 2;
        return 0;
    }

    public static String infixToPostfix(String s) {
        Stack<Character> operators = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    postfix.append(operators.pop());
                }
                operators.pop();
            } else {
                while (!operators.isEmpty() && priority(ch) <= priority(operators.peek()) && operators.peek() != '(') {
                    postfix.append(operators.pop());
                }
                operators.push(ch);
            }
        }
        while (!operators.isEmpty()) {
            postfix.append(operators.pop());
        }
        return postfix.toString();
    }

    public static void main(String[] args) {
        String infix = "(7+9)*4/8-3";
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix Expression: " + postfix);
    }
}

    

