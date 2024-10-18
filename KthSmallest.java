public class KthSmallest {
        public static int kthSmallest(int[] arr, int k) {
            int low = 0;
            int high = arr.length - 1;
            k = k - 1; 
            
            while (low <= high) {
                int pivotIndex = partition(arr, low, high);
                
                if (pivotIndex == k) {
                    return arr[pivotIndex];  
                } else if (pivotIndex > k) {
                    high = pivotIndex - 1;  
                } else {
                    low = pivotIndex + 1;  
                }
            }
            return -1;
        }
       public static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low;
            
            for (int j = low; j < high; j++) {
                if (arr[j] <= pivot) {
                    swap(arr, i, j);
                    i++;
                }
            }
            swap(arr, i, high);
            return i;
        }
   public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    
        public static void main(String[] args) {
            int[] arr = {7, 10, 4, 3, 20, 15};
            int k = 3;
            System.out.println("The " + k + "rd smallest element is " + kthSmallest(arr, k));
        }
    }
    

