import java.util.*;
public class BasicSTL {
    public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);

   // System.out.println(st+" ");
   // System.out.println(st.size()+"");
   // st.pop();
   // System.out.println(st.size()+"");
   // System.out.print(st+" ");
    // we will use extra space
    Stack<Integer> temp = new Stack<>();
    while(st.size()>0){
        System.out.print(st.peek()+" ");
        int x = st.peek();
        st.pop();
        temp.push(x);
    }
    while(temp.size()>0){
        int x = temp.peek();
        temp.pop();
        st.push(x);
    }
   System.out.println(st.peek()+"");

    
}
    
}
