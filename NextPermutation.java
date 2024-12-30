public class NextPermutation {
        public void nextPermutation(int[] arr) {
            int i = arr.length - 1;
            while (i > 0) {
                if (arr[i - 1] < arr[i]) {
                    int n = i - 1;
                    for (int j = arr.length - 1; j > n; j--) {
                        if (arr[j] > arr[n]) {
                            int temp = arr[n];
                            arr[n] = arr[j];
                            arr[j] = temp;
                            break;
                        }
                    }
    
                    int p = i;
                    int q = arr.length - 1;
                    while (p < q) {
                        int temp = arr[p];
                        arr[p] = arr[q];
                        arr[q] = temp;
                        p++;
                        q--;
                    }
                    return;
                }
                i--;
            }
    
            int p = 0;
            int q = arr.length - 1;
            while (p < q) {
                int temp = arr[p];
                arr[p] = arr[q];
                arr[q] = temp;
                p++;
                q--;
            }
        }
    
        public static void main(String[] args) {
            NextPermutation solution = new NextPermutation();
            int[] arr = {1, 2, 3};
            solution.nextPermutation(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
    
    