public class FirstMissingPositiveNo {
    public static void swap(int arr[], int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static int firstMissingPositiveNo(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
            for(int j=0; j<arr.length; j++){
                if(arr[j]!=j+1){
                    return j+1;
                }
            }
        }
        return arr.length+1;
    }
    public static void main(String args[]){
        int arr[]={1,2,0};
        int m=firstMissingPositiveNo(arr);
        System.out.print(m+" ");
    }
    
}
