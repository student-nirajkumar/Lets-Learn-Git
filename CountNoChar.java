import java.util.*;

public class CountNoChar {
    public static void main(String[] args) {
        String str = "My name is Akash deep";
        
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {  // Skip spaces
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        char maxChar = ' ';
        int maxCount = 0;
        
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("The character that appears most is: " + maxChar + " with count: " + maxCount);
        System.out.println("\nCharacter frequencies:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
