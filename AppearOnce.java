public class AppearOnce {
    public static int appearOnce(int arr[]){
        int res=arr[0];
        for(int i=1; i<arr.length; i++){
            res =res^arr[i];
        }
        return res;
    }
    public static void main(String args[]){
        int [] arr={5,3,4,5,2,3,4};
        int m=appearOnce(arr);
        System.out.print(m+ " ");
    }
    
}
