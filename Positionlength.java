public class Positionlength {
    public int minimumJump(int point[]) {
        int n = point.length;
        int ans = n - 1;
        int first = -1, last = -1;

        for (int i = 0; i < n; i++) {
            int sqrt = (int) Math.sqrt(point[i]);
            if (sqrt * sqrt == point[i]) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        if (first != -1 && last != -1 && first != last) {
            ans = first + n - last;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] points = {1, 2, 4, 5, 9, 16};
        Positionlength solution = new Positionlength(); 
        int result = solution.minimumJump(points); 
        System.out.println("Minimum jumps required: " + result);
    }
}
