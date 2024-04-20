//import java.util.*;
public class ReverseSentence {
    String reverseWords(String S) {
        StringBuilder res= new StringBuilder();
        int StartIndex=S.length()-1;
        while (StartIndex>=0) {
            while(StartIndex>=0 && S.charAt(StartIndex)==' '){
                StartIndex--;
            }
            if(StartIndex<0){
                break;
            }
            int EndIndex=StartIndex;
            while(StartIndex>=0 && S.charAt(StartIndex) !=' '){
                StartIndex--;
            }
            if(res.length()==0){
                res.append(S.substring(StartIndex+1,EndIndex+1));
            }
            else{
                res.append(" ");
                res.append(S.substring(StartIndex+1,EndIndex+1));

            }

        }
        return res.toString();

    }
    public static void main(String [] args){
        ReverseSentence solution = new ReverseSentence();
        String input="Hello World!";
        System.out.println(" Original String : " + input);
        System.out.println(" Reverse Words : " + solution.reverseWords(input));
    }
    
}
