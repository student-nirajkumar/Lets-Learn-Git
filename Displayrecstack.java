import java.util.*;

public class Displayrecstack {
    // Method to display stack elements in reverse order
    public static void displayRev(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int x = st.peek();
        st.pop();
        displayRev(st);
        System.out.print(x + " ");
        st.push(x);
    }

    // Method to display stack elements in normal order
    public static void display(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int x = st.peek();
        st.pop();
        display(st);
        System.out.print(x + " ");
        st.push(x);
    }

    // Method to push a value at the bottom of the stack
    public static void pushAtBottom(Stack<Integer> st, int val) {
        if (st.isEmpty()) {
            st.push(val);
            return;
        }
        int x = st.peek();
        st.pop();
        pushAtBottom(st, val); 
        st.push(x); 
    } 
    //Method to reverse the stack
   public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int x=st.peek();
        st.pop();
        reverse(st);
        pushAtBottom(st, x);




    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        
      //  System.out.print("Stack elements in normal order: ");
        display(st);
        
        System.out.println(); 
        
        //pushAtBottom(st, 100);
       // System.out.print("Stack elements after pushing 100 at bottom: ");
       // display(st);
       reverse(st);
       display(st);
    }
}
