import java.util.*;

public class AngramsOfString {
    public static void main(String[] args){
        String str1 = "physicswallah";
        str1.toLowerCase();
        String str2 = "wallahphysics";
        str2.toLowerCase();
        char[] st1 = str1.toCharArray();
        char[] st2 = str2.toCharArray();
        Arrays.sort(st1);
        Arrays.sort(st2);
        String sortedstring1 = new String(st1);
        String sortedstring2 = new String(st2);
        if(sortedstring1.equals(sortedstring2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.print("Strings are not Anagrams");
        }
    }
}
