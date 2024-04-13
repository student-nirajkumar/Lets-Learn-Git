public class CycleSort {
    public static void swap(int arr[], int x, int y){
        int temp=arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void cyclicsorting(int arr[]){
        int n= arr.length;
        int i=0;
        while(i<n){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i, correct);
            }
            else{ 
           i++;
            
            }
        }

    }
    public static void main(String args[]){
    int arr []={3,5,3,3,4};
    cyclicsorting(arr);
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
    }
        
    }

    
}
