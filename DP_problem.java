public class DP_problem {
    public static int callTarget(int arr[] , int target){
        if(target==0) return 1;
        if(target<0) return 0;
        
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3}; 
        int target = 5; 

        int x = callTarget(arr, target); 
        System.out.print(x);
    }
    
}
