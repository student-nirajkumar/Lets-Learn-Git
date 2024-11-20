public class PerfectNo {
        public static boolean checkPerfectNumber(int num) {
            int sum = 0;
            if (num <= 1) {
                return false;
            }
            // Loop through proper divisors only
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            // Check if sum of proper divisors equals num
            return sum == num;
        }
    
        public static void main(String[] args) {
            int num = 28; // Example input
            boolean isPerfect = checkPerfectNumber(num);
            System.out.println("Is " + num + " a perfect number? " + isPerfect);
        }
    }
