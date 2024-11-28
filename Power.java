public class Power {
    public static int pow(int x, int n) {
        if (n == 0) return 1; 
        if (n == 1) return x; 
        
        // If n is even
        if (n % 2 == 0) {
            int ans = pow(x, n / 2);
            return ans * ans;
        }
        // If n is odd
        else {
            int ans = pow(x, n / 2);
            return ans * ans * x;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        int result = pow(x, n); 
        System.out.println(result); 
    }
}
