public class BinarSearch {
        public static void main(String[] args) {
            int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
            int low = 0;
            int high = arr.length - 1;
            int k = 23;
            
            while (low <= high) {
                int mid = low + (high - low) / 2;
                
                if (arr[mid] == k) {
                    System.out.println("Target is present in the array at index " + mid);
                    return;
                } else if (arr[mid] < k) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            
            System.out.println("Target is not found");
        }
    }
    
    

