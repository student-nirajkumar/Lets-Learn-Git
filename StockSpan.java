import java.util.Stack;

public class StockSpan {
     public static void main(String[] args) {
        int arr[] ={100,80,60,81,70,60,75,85};
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int pgi[] = new int[n];
        Stack<Integer>st = new Stack<>();
        pgi[0] = 1;
        st.push(0);
        for(int i=1; i<=n-1; i++){
            while(st.size()>0 && arr[st.peek()]<=arr[i] ){
                st.pop();
            }
            if(st.size()==0) pgi[i] = -1;
            else pgi[i] = st.peek();
            pgi[i] = i-pgi[i];
            st.push(i);
        }
        for(int i=0; i<n; i++){
            System.out.print(pgi[i] + " ");
        }
        System.out.println();


    }
    
}
