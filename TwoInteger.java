public class TwoInteger {
        public int divide(int dividend, int divisor) {
            if (dividend == Integer.MIN_VALUE && divisor == -1) {
                return Integer.MAX_VALUE; // Handle overflow case
            }
    
            boolean isNegative = (dividend < 0) ^ (divisor < 0);
    
            long absDividend = Math.abs((long) dividend);
            long absDivisor = Math.abs((long) divisor);
    
            int result = 0;
    
            while (absDividend >= absDivisor) {
                long tempDivisor = absDivisor;
                int multiple = 1;
    
                while (absDividend >= (tempDivisor << 1)) {
                    tempDivisor <<= 1;
                    multiple <<= 1;
                }
    
                absDividend -= tempDivisor;
                result += multiple;
            }
    
            return isNegative ? -result : result;
        }
    
        public static void main(String[] args) {
            TwoInteger solution = new TwoInteger();
            System.out.println(solution.divide(10, 3)); // Output: 3
            System.out.println(solution.divide(7, -3)); // Output: -2
            System.out.println(solution.divide(-2147483648, -1)); // Output: 2147483647
        }
    }
    
    

