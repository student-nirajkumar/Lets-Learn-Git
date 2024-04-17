public class RepeatedSubString {
    public  static boolean repeatedSubstringPattern(String s) {
        int i=0;
        int j= s.length() - 1;
        int count=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                j--;

            }
            else{
                count++;
                j--;
            }
            
             }
             if(count>=2){
                return true;
        }

       
        return false;
    }
    public static void main(String args[]){
        String s ="aba";
        boolean m=repeatedSubstringPattern(s);
        System.out.print(m+" ");

    }
    
}
