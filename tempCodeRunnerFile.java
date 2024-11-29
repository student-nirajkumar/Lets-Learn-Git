public class SkipCharacter {
    publlic static void removeChar(String ans , String original){
        if(original.length()==0){
            System.out.print(ans+"");
        }
        Char ch = original[0];
        if(ch=='a') removeChar(ans, original.substring(1));
        else removeChar(ans+ch, original.substring(1));
    }
    public static void main(String[] args) {
        String str = "physics wallah";
        removeChar("" , str);

    }
    
}
