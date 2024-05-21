public class SecondLargestElement {
    public static void main(String [] args){
        int arr[]= {6,7,3,4,9,2,5};
        int firstlargest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>firstlargest){
                SecondLargest=firstlargest;
                firstlargest=arr[i];
            }
            else if(arr[i]>SecondLargest && arr[i] != firstlargest ){
                SecondLargest=arr[i];
            }
        }
        System.out.print("The Second Largest Elemenyt is:"+SecondLargest);
    }
    
}
