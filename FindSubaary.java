public class FindSubaary {
    public static void main(String[] args) {
        int arr[]= {4,3,7,2};
        int n= arr.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j ; k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    }
    
}
