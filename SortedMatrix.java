import java.util.Arrays;
public class SortedMatrix {
    static int[][] sortedMatrix(int N, int Mat[][]) {
        int[] arr = new int[N * N];
        int index = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[index++] = Mat[i][j];
            }
        }

        Arrays.sort(arr);

        index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Mat[i][j] = arr[index++];
            }
        }

        return Mat;
    }

    public static void main(String[] args) {
        int N = 3;
        int[][] Mat = {
            {3, 2, 1},
            {6, 5, 4},
            {9, 8, 7}
        };
        int[][] sortedMat = sortedMatrix(N, Mat);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(sortedMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
