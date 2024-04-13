public class PushingZero {
    public static void pushingzero(int arr[]){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                arr[count]=arr[i];
                count++;
            }
          
        }
        while(count<arr.length){
            arr[count]=0;
            count++;
        }
    }
     public static void main(String args[]){
         int arr[]={0, 1, 0, 2, 0, 3};
         pushingzero(arr);
         for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");
         }
     }
    
}
