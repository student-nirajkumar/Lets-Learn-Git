
    import java.util.Arrays;
    public class ArraySorts {
    public static void main(String[] args) {
        int[][] matrix = {
            {5, 3, 9},
            {8, 1, 4},
            {7, 6, 2}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] temp = new int[rows * cols];
        int index = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                temp[index++] = num;
            }
        }
        Arrays.sort(temp);
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = temp[index++];
            }
        }
        System.out.println("Fully Sorted Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}


