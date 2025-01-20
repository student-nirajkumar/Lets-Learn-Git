public class Allpossiblesub {
        public void printAllSubstrings(String s) {
            if (s == null || s.length() == 0) {
                System.out.println("No substrings available.");
                return;
            }
            char[] charArray = s.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = i; j < charArray.length; j++) {
                    sb.append(charArray[j]);  
                    System.out.println(sb.toString());  
                }
            }
        }
    
        public static void main(String[] args) {
            Allpossiblesub solution = new Allpossiblesub();
            String inputString = "abc";  
            solution.printAllSubstrings(inputString);
        }
    
    
    
}
