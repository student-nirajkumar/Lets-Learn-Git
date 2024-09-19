import java.util.*;
public class Stackreverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
         st.push(10);
         st.push(20);
         st.push(30);
         st.push(40);
         st.push(50);
         System.out.println(st+" ");
         Stack<Integer> gt = new Stack<>();
         Stack<Integer> rt = new Stack<>();
         //epty st into gt
         while(st.size()>0){
            gt.push(st.peek());
            st.pop();
         }
         //empty gt into rt
         while(gt.size()>0){
            rt.push(gt.peek());
            gt.pop();
         }
         //empty rt into st
         while(rt.size()>0){
            st.push(rt.peek());
            rt.pop();
         }

       System.out.print(st+" ");




    }
    
}
