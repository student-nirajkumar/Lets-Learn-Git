public class RemoveDuplicate {
    public static int removeDuplicate(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[temp] != arr[i]) {
                temp++;
                arr[temp] = arr[i];
            }
        }
        return temp + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 3, 4, 6, 6 };

        System.out.println("Array before Remove Duplicate:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int m = removeDuplicate(arr);

        System.out.println("\nArray after removing duplicate values:");
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
