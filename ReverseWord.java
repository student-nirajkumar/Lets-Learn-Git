public class ReverseWord {
    public static void main(String[] args) {
        String str1 = "I am an Educator";
        String ans = ""; 
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i); 

            if (ch != ' ') {
                sb.append(ch); 
            } else {
                ans += sb;
                ans +=" "; 
                sb=new StringBuilder(""); 
            }
        }

        sb.reverse(); 
        ans += sb.toString(); 
        System.out.print(ans); 
    }
}
