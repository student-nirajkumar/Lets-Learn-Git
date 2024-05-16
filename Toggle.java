import java.util.*;
import java.util.Scanner;
public class Toggle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter The String :");
        String str = sc.nextLine();
        StringBuilder sb= new StringBuilder(str);
        for(int i=0; i<str.length(); i++){
            boolean flag = true;
            char ch= str.charAt(i);
            if(ch ==' ') continue;
            int ascii = (int) ch;
            if(ascii>=97) flag= false;
            if(flag==true){
                ascii+=32;
                char cd= (char) ascii;
                sb.setCharAt(i, cd);
            }
            else{
                ascii-=32;
                char cd= (char) ascii;
                sb.setCharAt(i, cd);
            }
        }
        System.out.print(sb.toString() + " ");

    }


    
}
