import java.util.Arrays;
public class SetMismatch {
    public static void swap(int arr[], int x, int y){
        int temp=arr[x];
        arr[x] = arr[y];
        arr[y]= temp;
    }
    public static int []setMismatch(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
            for(int j=0; j<arr.length; j++){
                if(arr[j]!=j+1){
                    return new int[]{arr[j], j+1};
                }
            }
        }
        return new int []{-1,-1};
    }
    public static void main(String args[]){
        int arr[] ={1,2,2,4};
        int[] m=setMismatch(arr);
        System.out.print(Arrays.toString(m));
    }
    
}
