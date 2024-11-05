import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElemnetMorethatOne {
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> result = new ArrayList<>(); // Declare and initialize the result list
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate && !result.contains(arr[i])) {
                result.add(arr[i]);
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        
        List<Integer> duplicates = findDuplicates(arr);
        
        System.out.println("Duplicate elements: " + duplicates);
    }
}

    

