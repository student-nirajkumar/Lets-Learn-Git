public class MissinInarr {
    int missingNumber(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) return i + 1;
        }
        return arr.length + 1;
    }

    public static void main(String[] args) {
        MissinInarr sol = new MissinInarr();
        int arr[] = {1, 2, 3, 5};
        System.out.println(sol.missingNumber(arr));
    }
}
