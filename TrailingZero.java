public class TrailingZero {
    public static void main(String[] args) {
        int [] arr = {1,2,0,4,6,8,0,9,0,6};
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
               int temp=arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j++;
            }
        }
        for( int k=0; k<arr.length; k++){
            System.out.print(arr[k]+" ");

        }

    }
    
}
