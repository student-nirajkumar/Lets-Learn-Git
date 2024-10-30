public class Implementstrstr {
        int strstr(String s, String x) {
            
            return s.indexOf(x);
        }
    
        public static void main(String[] args) {
            Implementstrstr gfg = new Implementstrstr();
            
            // Test cases
            String s = "hello world";
            String x = "world";
            
            
            int result = gfg.strstr(s, x);
            
            if (result != -1) {
                System.out.println("The substring '" + x + "' is found at index: " + result);
            } else {
                System.out.println("The substring '" + x + "' is not found.");
            }
        }
    }
    
    

