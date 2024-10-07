import java.util.*;
public class BinaryToDecimal {
   public static void main(String[] args) {
        int n = 10; 
        int ans = 0;
        int i = 0;

        while (n != 0) {
            int bit = n & 1; 
            ans = (bit * (int)Math.pow(10, i)) + ans; 
            n = n >> 1; 
            i++;
        }
        System.out.print("Binary representation is: " + ans);
    } 
}
