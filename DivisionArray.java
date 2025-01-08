public class DivisionArray {
    public static void main(String[] args) {
        int arr[] = {3, 4, -2, 5, 8, 20, -10, 8};
        int n = arr.length;
        // for (int i = 0; i < n - 1; i++) {
        //     int sum1 = 0;
        //     int sum2 = 0;
        //     for (int j = 0; j <= i; j++) sum1 += arr[j];
        //     for (int j = i + 1; j < n; j++) sum2 += arr[j];
        //     if (sum1 == sum2) {
        //         System.out.println("Equilibrium index found at: " + i);
        //         return; 
        //     }
        // }
        // System.out.println("No equilibrium index found.");
          int sum=0;
          for(int i=0; i<n; i++){
            sum+=arr[i];
          }
          int prefix=0;
          for(int i=0; i<n-1; i++){
            prefix+=arr[i];
            int res=sum-prefix;
            if(res==prefix){
                System.out.println("Equilibrium index found at: " + i);
                       return;  
            }
          }
          System.out.println("No equilibrium index found."); 
    }
}

