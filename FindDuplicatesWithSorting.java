/*public class Finddublicate {
        public static void findDuplicates(int[] arr) {
            System.out.println("Duplicate elements in the array:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[i]);
                        break;
                    }
                }
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 2, 5, 3, 6};
            findDuplicates(arr);
        }
    }*/
  /*   import java.util.Arrays;

public class FindDuplicatesWithSorting {
    public static void findDuplicates(int[] arr) {
        Arrays.sort(arr);
        int lastPrinted = Integer.MIN_VALUE;

        System.out.println("Duplicate elements in the array:");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] && arr[i] != lastPrinted) {
                System.out.println(arr[i]);
                lastPrinted = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 3, 3, 2, 3, 2};
        findDuplicates(arr);
    }
}*/
import java.util.Arrays;

public class FindDuplicatesWithSorting {
    public static void findDuplicates(int[] arr) {
        Arrays.sort(arr);
        
        boolean hasDuplicates = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                hasDuplicates = true; 
                int count = 2; 
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    count++;
                    i++; 
                }
                System.out.println(arr[i] + " appears " + count + " times");
            }
        }
        if (!hasDuplicates) {
            System.out.println("No duplicate elements found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  
        findDuplicates(arr);
    }
}
