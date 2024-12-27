public class RemovalVowel {
    public static void main(String[] args) {
        String str = "Mountain"; 
        if (str == null || str.isEmpty()) {
            System.out.println("String is empty or null.");
            return;
        }
        
        str = str.toLowerCase(); 
        int n = str.length(); 
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char currentChar = str.charAt(i);
            if (currentChar != 'a' && currentChar != 'e' && currentChar != 'i' && currentChar != 'o' && currentChar != 'u') {
                sb.append(str.charAt(i));
            }
        }
        if (sb.length() == 0) {
            System.out.println("No consonants in the string.");
        } else {
            System.out.println(sb.toString());  // Print the result
        }
    }
}
