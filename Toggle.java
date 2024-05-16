//import java.util.*;
//import java.util.Scanner;
public class Toggle {
    public static void main(String [] args){
        //Scanner sc = new Scanner(System.in);
       // System.out.println(" Enter The String :");
        //String sb = sc.nextLine();
        String str1="PhySICS";
        StringBuilder sb= new StringBuilder(str1);
        for(int i=0; i<sb.length(); i++){
            boolean flag = true;
            char ch= sb.charAt(i);
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
        System.out.print(sb);

    }


    
}
