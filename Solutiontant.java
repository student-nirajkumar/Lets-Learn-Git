public class Solutiontant {
        public static int romanToDecimal(String s) {
            int sum = 0, prev = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                int curr = romanValue(s.charAt(i));
                if (curr < prev) {
                    sum -= curr;
                } else {
                    sum += curr;
                }
                prev = curr;
            }
            return sum;
        }
    
        private static int romanValue(char c) {
            if (c == 'I') return 1;
            if (c == 'V') return 5;
            if (c == 'X') return 10;
            if (c == 'L') return 50;
            if (c == 'C') return 100;
            if (c == 'D') return 500;
            return 1000;
        }
    
        public static void main(String[] args) {
            System.out.println(romanToDecimal("IX"));
            System.out.println(romanToDecimal("LVIII"));
            System.out.println(romanToDecimal("MCMXCIV"));
        }
    }
    
