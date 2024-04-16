
public class ShellSort {
    public static void swap(int arr[] ,int x, int y){
        int temp =arr[x];
        arr[x]= arr[y];
        arr[y]=temp;
    }
    public static void shellsorting(int arr[]){
        for(int gap=arr.length/2; gap>=1; gap/=2){
            for(int j=gap; j<arr.length; j++){
                for(int i=j-gap; i>=0; i-=gap)
                {
                    if(arr[i+gap]>arr[i]){
                        break;
                    }
                    else{
                        swap(arr, i, i+gap);

                    }
                        
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[] ={23,29,15,19,32,7,9,5,2};
        shellsorting(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }


    }
    
}
