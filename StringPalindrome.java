public class StringPalindrome {
    public static void main (String [] args){
        String str1 = "CIVIC";
        int i = 0;
        int j = str1.length() - 1;
        boolean isPalindrome = true;
        while(i <= j){
            if(str1.charAt(i) != str1.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome){
            System.out.println("The String is palindrome.");
        } else {
            System.out.println("It is not palindrome.");
        }
    }
}
