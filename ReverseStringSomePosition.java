public class ReverseStringSomePosition {
    public static void main(String[] args) {
        String input = "HelloWorld"; 
        if (input.length() > 5) {
            StringBuilder sb = new StringBuilder(input);
            String partToReverse = sb.substring(2, 6);
            String reversedPart = new StringBuilder(partToReverse).reverse().toString();
            sb.replace(2, 6, reversedPart);
            System.out.println("Original String: " + input);
            System.out.println("Modified String: " + sb.toString());
        } else {
            System.out.println("Input string length must be greater than 5.");
        }
    }
}
