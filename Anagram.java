import java.util.*;
public class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.trim();
        str2 = str2.trim();
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("hello", "world"));   
        System.out.println(isAnagram("geeksforgeeks", "forgeeksgeeks")); 
    }


    
}
