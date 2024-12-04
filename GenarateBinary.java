public class GenarateBinary {
    //static int n = 3;  

    public static void generate(String s, int n) {
            if (n==0) {
            System.out.println(s);
            return;
        }
        generate(s + '0',n-1);
        if(s=="" || s.charAt(s.length()-1) == '0'){
        generate(s + '1',n-1);
        }
    }

    public static void main(String[] args) {
        int n=3;
        generate("", n);
    }
}
