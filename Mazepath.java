public class Mazepath {
    public static int maze(int sr, int sc, int er, int ec) {
        if (sr > er || sc > ec) return 0;
        if (sr == er && sc == ec) return 1;
        int rightWays = maze(sr, sc + 1, er, ec);
        int downWays = maze(sr + 1, sc, er, ec);
        return rightWays + downWays;
    }

    public static int maze2(int row, int col) {
        if (row < 1 || col < 1) return 0;
        if (row == 1 && col == 1) return 1;
        int rightWays = maze2(row, col - 1);
        int downWays = maze2(row - 1, col);
        return rightWays + downWays;
    }

    public static void printPath(int sr, int sc, int er, int ec, String s) {
        if (sr > er || sc > ec) return;
        if (sr == er && sc == ec) {
            System.out.print(s + " ");
            return;
        }
        printPath(sr, sc + 1, er, ec, s + 'R');
        printPath(sr + 1, sc, er, ec, s + 'D');
    }

    public static void main(String[] args) {
        int ans = maze(0, 0, 2, 2);
        System.out.println("Total paths: " + ans);

        System.out.print("Paths: ");
        printPath(0, 0, 2, 2, "");
        
        int ans2 = maze2(3, 4);
        System.out.println("\nTotal paths: " + ans2);
    }
}
