public class FirstOccurence {
        public static int countOccurrences(int[] arr, int target) {
            int firstIndex = findFirstOccurrence(arr, target);
            if (firstIndex == -1) {
                return 0; 
            }
            int lastIndex = findLastOccurrence(arr, target);
            return lastIndex - firstIndex + 1;
        }
    
        private static int findFirstOccurrence(int[] arr, int target) {
            int left = 0, right = arr.length - 1, result = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == target) {
                    result = mid;
                    right = mid - 1; 
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return result;
        }
    
        private static int findLastOccurrence(int[] arr, int target) {
            int left = 0, right = arr.length - 1, result = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == target) {
                    result = mid;
                    left = mid + 1; 
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return result;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 1, 2, 2, 2, 2, 3};
            int target1 = 2;
            int target2 = 4;
    
            System.out.println(countOccurrences(arr, target1));
            System.out.println(countOccurrences(arr, target2));
        }
    
    
}
//T.C=O(logn);
//S.C=O(1);