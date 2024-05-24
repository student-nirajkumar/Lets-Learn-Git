public class SecondLargest {
    public static int findSecondLargest(int a, int b, int c) {
        // If a is the largest
        if ((a > b && a < c) || (a > c && a < b)) {
            return a;
        }
        // If b is the largest
        else if ((b > a && b < c) || (b > c && b < a)) {
            return b;
        }
        // If c is the largest
        else {
            return c;
        }
    }

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        System.out.println("Second largest: " + findSecondLargest(a, b, c));
    }
}
