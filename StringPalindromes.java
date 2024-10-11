public class StringPalindromes {
    
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase and remove any non-alphanumeric characters
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;
        
        // Compare characters from both ends of the string
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    }
    
    public static void main(String[] args) {
        // Test the palindrome method with various strings
        String test1 = "A man, a plan, a canal, Panama";
        String test2 = "hello";
        String test3 = "madam";
        
        System.out.println(test1 + " is a palindrome: " + isPalindrome(test1));
        System.out.println(test2 + " is a palindrome: " + isPalindrome(test2));
        System.out.println(test3 + " is a palindrome: " + isPalindrome(test3));
    }
}
