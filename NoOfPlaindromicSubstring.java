public class NoOfPlaindromicSubstring {
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String args[])
    {
        String str1="abbd";
        int count=0;
        for(int i=0; i<=str1.length()-1; i++ ){
            for(int j=i+1; j<=str1.length(); j++){
                if(isPalindrome(str1.substring(i,j))==true) {
                    System.out.print(str1.substring(i,j)+" ");
                    count++;
                }
            }
          
        }
        System.out.print("\nNo of Plaindromic Substring are: " + count);
    }
}
