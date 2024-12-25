public class Trail {
        void pushZerosToEnd(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[count] = arr[i];
                    count++;
                }
            }
            while (count < arr.length) {
                arr[count] = 0;
                count++;
            }
        }
        public static void main(String[] args) {
            Trail  solution = new Trail ();
            
            int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
            System.out.println("Original Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            
            solution.pushZerosToEnd(arr);
            
            System.out.println("\nArray After Moving Zeros to the End:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
