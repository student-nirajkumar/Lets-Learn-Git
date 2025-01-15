
 //1. Richest Customer Wealth import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int m = sc.nextInt(), n = sc.nextInt(); 
            int[][] accounts = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    accounts[i][j] = sc.nextInt(); 
                }
            }

            int maxWealth = 0;
            for (int i = 0; i < m; i++) {
                int customerWealth = 0;
                for (int j = 0; j < n; j++) {
                    customerWealth += accounts[i][j];
                }
                maxWealth = Math.max(maxWealth, customerWealth);
            }

            System.out.println(maxWealth);
        }
        sc.close();
    }
}
//2. Count Negative Numbers in a Sorted Matrix  import java.util.Scanner;

public class CountNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int m = sc.nextInt(), n = sc.nextInt(); 
            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt(); 
                }
            }

            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] < 0) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
//3. Matrix Diagonal Sum import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt(); 
                }
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += matrix[i][i] + matrix[i][n - i - 1];
            }
            if (n % 2 == 1) {
                sum -= matrix[n / 2][n / 2]; 
            }

            System.out.println(sum);
        }
        sc.close();
    }
}
//4. Convert 1D Array Into 2D Array import java.util.Scanner;

public class Convert1DTo2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int m = sc.nextInt(), n = sc.nextInt(); 
            int[] arr = new int[m * n];
            for (int i = 0; i < m * n; i++) {
                arr[i] = sc.nextInt(); 
            }

            int[][] matrix = new int[m][n];
            for (int i = 0; i < m * n; i++) {
                matrix[i / n][i % n] = arr[i]; 
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
// 5. Reshape the Matrix  import java.util.Scanner;

public class ReshapeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int r = sc.nextInt(), c = sc.nextInt(); 
            int m = sc.nextInt(), n = sc.nextInt(); 
            int[][] mat = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = sc.nextInt(); 
                }
            }

            if (r * c != m * n) {
                System.out.println("Invalid Reshape");
            } else {
                int[][] reshaped = new int[r][c];
                for (int i = 0; i < r * c; i++) {
                    reshaped[i / c][i % c] = mat[i / n][i % n];
                }
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        System.out.print(reshaped[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
// 6. Transpose Matrix   import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int m = sc.nextInt(), n = sc.nextInt(); 
            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt(); 
                }
            }

            int[][] transpose = new int[n][m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    transpose[j][i] = matrix[i][j]; 
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
//  7. Spiral Matrix  import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt(), n = sc.nextInt(); 
            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt(); 
                }
            }

            int top = 0, left = 0, bottom = m - 1, right = n - 1;
            while (top <= bottom && left <= right) {
                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i] + " "); 
                }
                top++;
                for (int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right] + " "); 
                }
                right--;
                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        System.out.print(matrix[bottom][i] + " "); 
                    }
                    bottom--;
                }
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(matrix[i][left] + " "); 
                    }
                    left++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
// spiral matri 2 import java.util.Scanner;

public class SpiralMatrixII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[][] matrix = new int[n][n];
            int val = 1;
            int top = 0, left = 0, bottom = n - 1, right = n - 1;
            while (top <= bottom && left <= right) {
                for (int i = left; i <= right; i++) {
                    matrix[top][i] = val++; 
                }
                top++;
                for (int i = top; i <= bottom; i++) {
                    matrix[i][right] = val++; 
                }
                right--;
                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        matrix[bottom][i] = val++; 
                    }
                    bottom--;
                }
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        matrix[i][left] = val++; 
                    }
                    left++;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
// 9. Rotate Image  import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt(); 
                }
            }
            for (int i = 0; i < n / 2; i++) {
                for (int j = i; j < n - i - 1; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[n - j - 1][i];
                    matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                    matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                    matrix[j][n - i - 1] = temp;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
// 10. Set Matrix Zeroes import java.util.Scanner;

import java.util.Scanner;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int m = sc.nextInt(), n = sc.nextInt(); 
            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt(); 
                }
            }

            boolean[] row = new boolean[m];
            boolean[] col = new boolean[n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        row[i] = true;
                        col[j] = true;
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (row[i] || col[j]) {
                        matrix[i][j] = 0;
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
//11. Valid Sudoku   import java.util.Scanner;

import java.util.Scanner;

public class ValidSudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            char[][] board = new char[9][9];
            for (int i = 0; i < 9; i++) {
                String row = sc.next(); 
                board[i] = row.toCharArray();
            }

            boolean valid = isValidSudoku(board);
            System.out.println(valid ? "Valid" : "Invalid");
        }
        sc.close();
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !isValid(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] board, int row, int col) {
        char val = board[row][col];
        for (int j = 0; j < 9; j++) {
            if (j != col && board[row][j] == val) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (i != row && board[i][col] == val) {
                return false;
            }
        }
        int startRow = row / 3 * 3;
        int startCol = col / 3 * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (i != row && j != col && board[i][j] == val) {
                    return false;
                }
            }
        }

        return true;
    }
}
