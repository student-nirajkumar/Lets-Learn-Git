public class AddBinar {
        public String addBinary(String a, String b) {
            StringBuilder result = new StringBuilder();
            int carry = 0;
            
            int i = a.length() - 1;
            int j = b.length() - 1;
            
            while (i >= 0 || j >= 0 || carry > 0) {
                int sum = carry;
                if (i >= 0) {
                    sum += a.charAt(i) - '0';
                    i--;
                }
                if (j >= 0) {
                    sum += b.charAt(j) - '0';
                    j--;
                }
                result.append(sum % 2); 
                carry = sum / 2; 
            }
            
            return result.reverse().toString(); 
        }
    
        public static void main(String[] args) {
            AddBinar solution = new  AddBinar();
            String a = "1010";
            String b = "1011";
            System.out.println(solution.addBinary(a, b));
        }
    }
