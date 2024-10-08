import java.util.Scanner;

class JumppingNo {
    static long JumppingNo(long X) {
        long result = 0;
        
        for (long i = 0; i <= X; i++) {
            if (isJumpingNumber(i)) {
                result = i; 
            }
        }
        
        return result;  
    }

    static boolean isJumpingNumber(long num) {
        if (num < 10) {  
            return true;
        }
        
        long prevDigit = num % 10; 
        num /= 10;  
        
        while (num > 0) {
            long currDigit = num % 10;
            if (Math.abs(currDigit - prevDigit) != 1) {  
                return false;
            }
            prevDigit = currDigit;  
            num /= 10; 
        }
        
        return true;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");  
        long X = sc.nextLong();
        System.out.println("Largest jumping number up to " + X + " is: " + JumppingNo(X)); 
    }
}
