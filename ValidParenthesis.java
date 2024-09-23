class  ValidParenthesis{
    public static boolean isValid(String s) {
        int roundCount = 0;
        int curlyCount = 0;
        int squareCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                roundCount++;
            } else if (c == ')') {
                roundCount--;
                if (roundCount < 0) return false;
            } else if (c == '{') {
                curlyCount++;
            } else if (c == '}') {
                curlyCount--;
                if (curlyCount < 0) return false;
            } else if (c == '[') {
                squareCount++;
            } else if (c == ']') {
                squareCount--;
                if (squareCount < 0) return false;
            }
        }

        return roundCount == 0 && curlyCount == 0 && squareCount == 0;
    }

    public static void main(String[] args) {
        String test1 = "([{}])";
        String test2 = "([)]";
        String test3 = "{[]}";
        String test4 = "((()))";
        String test5 = "([{}]){}[]";

        System.out.println(test1 + " is valid: " + isValid(test1));
        System.out.println(test2 + " is valid: " + isValid(test2));
        System.out.println(test3 + " is valid: " + isValid(test3));
        System.out.println(test4 + " is valid: " + isValid(test4));
        System.out.println(test5 + " is valid: " + isValid(test5));
    }
}
