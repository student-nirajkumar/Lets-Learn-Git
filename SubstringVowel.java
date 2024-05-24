public class SubstringVowel {
        // Input a string and return the number of substrings that contain only vowels.
        // Input : str = "abjkoe"
        // Output : 4
        // Explanation : The possible substrings that only contain vowels are "a" , "o" , "e" , "oe"
        // Input : str = "hgdhpw"
        public static void main(String[] args) {
            String str = "aba";
            int count = 0;
    
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j <= str.length(); j++) {
                    String substring = str.substring(i, j);
                    boolean allVowels = true;
                    for (int k = 0; k < substring.length(); k++) {
                        char ch = substring.charAt(k);
                        if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                            allVowels = false;
                            break;
                        }
                    }
                    if (allVowels) {
                        count++;
                    }
                }
            }
            System.out.print("The number of substrings that contain only vowels in the string are: " + count);
        }
    }
    
    

