public class ContiniousSum {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        for(int i=1; i<n; i++){
            arr[i]+=arr[i-1];
        }
        boolean flag=false; 
        for(int i=0; i<n; i++){
            if(2*arr[i]==arr[n-1]){
                flag=true;
                break;
            
            }
        }
        if(flag){
            System.out.print("It can be partions");
        }
        else{
            System.out.print("It can not be partion:");
        }
    }
    
}
