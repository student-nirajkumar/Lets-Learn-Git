public class Dublicatno {
    public static void swap(int arr[], int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y] = temp;
    }
    public static int dublicate(int arr[]){
        int i=0;
        while(i<arr.length){
            if (arr[i]!=i+1){
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]= {1,3,4,2,2};
        int m=dublicate(arr);
        System.out.print(m+" ");

    }
    
}
