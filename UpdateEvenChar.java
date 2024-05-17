public class UpdateEvenChar
 {
    public static String updateEvenPositions(String str) {
        char[] charArray = str.toCharArray();
        //for (int i = 1; i < str.length(); i += 2) { for odd place 
        for (int i = 0; i < str.length(); i += 2) {
            charArray[i] = 'a';
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "Hello World";
        String updatedString = updateEvenPositions(input);
        System.out.println(updatedString);
    }
}
