public class pluseOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        pluseOne solution = new pluseOne();
        int[] digits1 = {1, 2, 3};
        int[] result1 = solution.plusOne(digits1);
        System.out.print("Result 1: ");
        for (int digit : result1) {
            System.out.print(digit + " ");
        }
        System.out.println();
        int[] digits2 = {4, 3, 9};
        int[] result2 = solution.plusOne(digits2);
        System.out.print("Result 2: ");
        for (int digit : result2) {
            System.out.print(digit + " ");
        }
        System.out.println();
        int[] digits3 = {9, 9, 9};
        int[] result3 = solution.plusOne(digits3);
        System.out.print("Result 3: ");
        for (int digit : result3) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}
