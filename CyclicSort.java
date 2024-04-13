public class CyclicSort {
        public static void swap(int arr[], int x, int y){
            int temp=arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        public static void cyclicsorting(int arr[]){
            int n= arr.length;
            int i=0;
            while(i<n){
                if(arr[i]==i+1){
                i++;
                }
                else{ 
                swap(arr,i, arr[i]-1);
                }
            }
    
        }
        public static void main(String args[]){
        int arr []={3,5,2,1,4};
        cyclicsorting(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
            
        }
    }
       
    
    
}
