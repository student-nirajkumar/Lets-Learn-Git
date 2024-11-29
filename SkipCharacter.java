public class SkipCharacter {
    public static void removeChar(String ans, String original) {
        if (original.length() == 0) {
            System.out.print(ans);
            return;
        }
        char ch = original.charAt(0);
        if (ch == 'a') {
            removeChar(ans, original.substring(1));
        } else {
            removeChar(ans + ch, original.substring(1));
        }
    }
       // Method 2
    public static void removeChar2(String ans, String original, int idx) {
        if (original.length() == idx) {
            System.out.print(ans);
            return;
        }
        char ch = original.charAt(idx);
        if (ch == 'a') {
            removeChar2(ans, original, idx + 1);
        } else {
            removeChar2(ans + ch, original, idx + 1);
        }
    }

    public static void main(String[] args) {
        String str = "physics wallah";
        removeChar("", str);
        System.out.println();
        removeChar2("", str, 0);
    }
}
