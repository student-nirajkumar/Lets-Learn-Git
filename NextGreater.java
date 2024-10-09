import java.util.*;
public class NextGreater {
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 7, 4, 6, 2, 3};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        int nge[] = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            nge[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    nge[i] = arr[j];
                    break;
                }
            }
        }
        
        for (int i = 0; i < nge.length; i++) {
            System.out.print(nge[i] + " ");
        }
        System.out.println();
    }
}

