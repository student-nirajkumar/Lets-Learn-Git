public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 8;
        matrix[1][1] = 9;
        matrix[1][2] = 4;

        matrix[2][0] = 7;
        matrix[2][1] = 6;
        matrix[2][2] = 5;
        int left = 0, top = 0;
        int right = matrix.length - 1;
        int down = matrix[0].length - 1;

        while (left <= right && top <= down) {
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            for (int i = top; i <= down; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if (top <= down) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[down][i] + " ");
                }
                down--;
            }

            if (left <= right) {
                for (int i = down; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
