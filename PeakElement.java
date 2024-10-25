public class PeakElement {
        public int peakElement(int[] arr, int n) {
            for (int i = 0; i < n; i++) {
                if ((i == 0 || arr[i] >= arr[i - 1]) && (i == n - 1 || arr[i] >= arr[i + 1])) {
                    return i;
                }
            }
            return -1;
        }
    
        public static void main(String[] args) {
            PeakElement solution = new  PeakElement();
            int[] arr = {1, 3, 20, 4, 1, 0};
            int n = arr.length;
            int peakIndex = solution.peakElement(arr, n);
            System.out.println("Peak element index: " + peakIndex);
        }
    }
    
    
