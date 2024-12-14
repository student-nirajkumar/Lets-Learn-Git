public class DivideTwoInteger {
        public int divide(int dividend, int divisor) {
            if (dividend == Integer.MIN_VALUE && divisor == -1) {
                return Integer.MAX_VALUE;
            }
            
            long dividendLong = Math.abs((long) dividend);
            long divisorLong = Math.abs((long) divisor);
            int result = 0;
            
            while (dividendLong >= divisorLong) {
                long temp = divisorLong, multiple = 1;
                while (dividendLong >= (temp << 1)) {
                    temp <<= 1;
                    multiple <<= 1;
                }
                dividendLong -= temp;
                result += multiple;
            }
            
            if ((dividend < 0) ^ (divisor < 0)) {
                result = -result;
            }
            
            return result;
        }
    
        public static void main(String[] args) {
            DivideTwoInteger solution = new DivideTwoInteger();
            
            int dividend = 10;
            int divisor = 3;
            int result = solution.divide(dividend, divisor);
            System.out.println("Result: " + result);  // Expected output: 3
            
            dividend = 7;
            divisor = -3;
            result = solution.divide(dividend, divisor);
            System.out.println("Result: " + result);  // Expected output: -2
            
            dividend = -2147483648;
            divisor = -1;
            result = solution.divide(dividend, divisor);
            System.out.println("Result: " + result);  // Expected output: 2147483647 (Integer.MAX_VALUE)
        }
    }
    

