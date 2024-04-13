public class MissingNo {
    public static void swap(int arr[], int x, int y){
        int temp=arr[x];
        arr[x] = arr[y];
        arr[y]=temp;
    }
    public static int missingno(int arr[]){
        int n=arr.length;
        int i=0;
        while(i<n){
            int correct=arr[i];
            if(arr[i]< n && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0; j<n;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return n;
    }

    public static void  main(String args[]){
        int arr[] = {3,0,1};
        int m=missingno(arr);
        System.out.print(m + " ");
    }

    
}
