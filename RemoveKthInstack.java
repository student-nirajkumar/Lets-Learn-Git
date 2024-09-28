import java.util.Stack;

public class RemoveKthInstack {
    public static void removeKthElement(Stack<Integer> st, int k){
        Stack<Integer> temp = new Stack<>();
        
        
        while(st.size() > k){
            temp.push(st.peek());
            st.pop();
        }
        st.pop();
        
        
        while(temp.size() > 0){
            st.push(temp.peek());
            temp.pop();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int k = 3;
        removeKthElement(st, k);

        System.out.println("Stack after removing " + k + "-th element: " + st);
    }
}
