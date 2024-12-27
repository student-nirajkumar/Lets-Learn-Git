public class Fibonacci {
        public static void main(String[] args) {
            int n1 = 0;
            int n2 = 1;
            int n = 10;
            int res = 0;
            
            System.out.print("Fibonacci sequence up to " + n + ": ");
            System.out.print(n1 + " " + n2 + " ");
            
            for (int i = 2; i < n; i++) {
                res = n1 + n2;
                System.out.print(res + " "); // Print each Fibonacci number
                n1 = n2;
                n2 = res;
            }
            
            System.out.println(); 
            System.out.println("The " + n + "th Fibonacci number is: " + res);
        }
    }
