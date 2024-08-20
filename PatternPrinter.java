public class PatternPrinter {

    public static void printPattern(int n) {
        // Print the first half of the pattern
        for (int i = 1; i <= n; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the second half of the pattern
        for (int i = n - 2; i > 0; i -= 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5;  
        printPattern(rows);
    }
}
