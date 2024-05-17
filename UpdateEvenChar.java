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
//public class Main {
   // public static String updateEvenPositions(String str) {
    //    StringBuilder stringBuilder = new StringBuilder(str);
    //    for (int i = 0; i < str.length(); i++) {
       //     if (i % 2 == 0) {
       //         stringBuilder.setCharAt(i, 'a');
       //     }
      //  }
        //return stringBuilder.toString();
   // }

  //  public static void main(String[] args) {
     //   String input = "Hello World";
      //  String updatedString = updateEvenPositions(input);
      //  System.out.println(updatedString); // Output: "hallo Warld"
   // }
//}
//public class Main {
//    public static void main(String[] args) {
    //    String input = "Hello World";
      //  StringBuilder stringBuilder = new StringBuilder(input);
       // for (int i = 0; i < input.length(); i++) {
       //     if (i % 2 == 0) {
     //           stringBuilder.setCharAt(i, 'a');
     //       }
      //  }
       // String updatedString = stringBuilder.toString();
       // System.out.println(updatedString); // Output: "hallo Warld"
  //  }
//}
