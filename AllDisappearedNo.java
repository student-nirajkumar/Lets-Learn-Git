public class AllDisappearedNo {
    public static void swap(int arr[], int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int[] alldisappearingno(int arr[]){
        int n = arr.length;
        int i = 0;
        while(i < n){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }

        int count = 0;
        for(int j = 0; j < n; j++){
            if(arr[j] != j + 1){
                count++;
            }
        }

        int[] disappearedNumbers = new int[count];
        int index = 0;
        for(int j = 0; j < n; j++){
            if(arr[j] != j + 1){
                disappearedNumbers[index++] = j + 1;
            }
        }
        return disappearedNumbers;
    }

    public static void main(String[] args){
        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] disappeared = alldisappearingno(arr);
        for(int num : disappeared) {
            System.out.print(num + " ");
        }
    }
}
