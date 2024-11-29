public class SubsetOfString {
    public static void printSubset(String ans, String original) {
        if (original == "") {
            System.out.println(ans);
            return;
        }
        char ch = original.charAt(0);
        printSubset(ans + ch, original.substring(1));
        printSubset(ans, original.substring(1));
    }

    public static void printSubsetWithIndex(String ans, String original, int index) {
        if (index == original.length()) {
            System.out.println(ans);
            return;
        }
        char ch = original.charAt(index);
        printSubsetWithIndex(ans + ch, original, index + 1);
        printSubsetWithIndex(ans, original, index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubset("", str);
        printSubsetWithIndex("", str, 0);
    }
}
