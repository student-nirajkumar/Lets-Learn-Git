
    import java.util.Scanner;

    public class Permutation {
    static long nPr(long n, long r) {
        long result = 1;
        for (long i = n; i > n - r; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        long n = sc.nextLong();
        System.out.print("Enter r: ");
        long r = sc.nextLong();
        System.out.println("nPr = " + nPr(n, r));
        sc.close();
    }
}