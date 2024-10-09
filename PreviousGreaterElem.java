import java.util.*;
public class PreviousGreaterElem {
    public static void main(String[] args) {
        int arr[] ={3,1,2,7,4,6,2,3};
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int pge[] = new int[n];
        Stack<Integer>st = new Stack<>();
        pge[0] = -1;
        st.push(arr[0]);
        for(int i=1; i<=n-1; i++){
            while(st.size()>0 && st.peek()<=arr[i] ){
                st.pop();
            }
            if(st.size()==0) pge[i] = -1;
            else pge[i] = st.peek();
            st.push(arr[i]);
        }
        for(int i=0; i<n; i++){
            System.out.print(pge[i] + " ");
        }
        System.out.println();


    }
    
}
