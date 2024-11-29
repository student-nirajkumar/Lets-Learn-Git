public class Permutationstring {
    public static void permutation(String ans, String original) {
        if (original.isEmpty()) { 
            System.out.print(ans + " "); 
        }
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            String left = original.substring(0, i);
            String right = original.substring(i + 1);
            permutation(ans + ch, left + right);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutation("", str); 
    }
}

      // System.out.print(str.substring(1, 2));
      // C ka index hai 2, string len= 5 (0-4)
      //String left = str.substring(0,2);
      //System.out.println(left+"");
      //String right = str.substring(2+1);
      //System.out.println(right+"");


