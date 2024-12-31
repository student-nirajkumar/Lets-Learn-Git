public class ConditionTring {
        public static int countAndPrintTriangleTriplets(int[] arr) {
            int n = arr.length;
            int count = 0;
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (arr[i] + arr[j] > arr[k] && arr[i] + arr[k] > arr[j] && arr[j] + arr[k] > arr[i]) {
                            System.out.println("Triplet: (" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                            count++;
                        }
                    }
                }
            }
    
            return count;
        }
    
        public static void main(String[] args) {
            int[] arr = {4, 6, 3, 7}; 
            int count = countAndPrintTriangleTriplets(arr);
            System.out.println("Number of triplets that form a triangle: " + count);
        }
    }
 
