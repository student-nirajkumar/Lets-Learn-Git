public class CompressedString {
    public static void main(String args[]){
        String str1= "aaabbbcccddde";
        String ans=""+str1.charAt(0);
        int count=1;  
        for(int i=1; i<str1.length(); i++){
            char curr=str1.charAt(i);
            char prev = str1.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
                if(count>1)
                    ans+=count;
                count=1; 
                ans+=curr;
            }
        }
        if(count>1)
            ans+=count;
        System.out.print(ans); 
    }
}
