import java.util.Stack;

public class InfixToprefixconversion {
    public static int priority(char ch) {
        if (ch == '+' || ch == '-') return 1;
        else if (ch == '*' || ch == '/') return 2;
        return 0;
    }

    public static String infixToPrefix(String s) {
        Stack<Character> operators = new Stack<>();
        Stack<String> operands = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                operands.push(ch + "");
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    char operator = operators.pop();
                    String op2 = operands.pop();
                    String op1 = operands.pop();
                    String result = operator + op1 + op2;
                    operands.push(result);
                }
                operators.pop();
            } else {
                while (!operators.isEmpty() && priority(ch) <= priority(operators.peek()) && operators.peek() != '(') {
                    char operator = operators.pop();
                    String op2 = operands.pop();
                    String op1 = operands.pop();
                    String result = operator + op1 + op2;
                    operands.push(result);
                }
                operators.push(ch);
            }
        }
        while (!operators.isEmpty()) {
            char operator = operators.pop();
            String op2 = operands.pop();
            String op1 = operands.pop();
            String result = operator + op1 + op2;
            operands.push(result);
        }
        return operands.pop();
    }

    public static void main(String[] args) {
        String infix = "(7+9)*4/8-3";
        String prefix = infixToPrefix(infix);
        System.out.println("Prefix Expression: " + prefix);
    }
}

    
