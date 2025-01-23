public class TrappingRainWater {
        public static int trap(int[] height) {
            int lmax = 0;
            int rmax = 0;
            int total = 0;
            int i = 0;
            int j = height.length - 1;
    
            while (i < j) {
                if (height[i] <= height[j]) {
                    if (lmax > height[i]) {
                        total += lmax - height[i];
                    } else {
                        lmax = height[i];
                    }
                    i++;
                } else {
                    if (rmax > height[j]) {
                        total += rmax - height[j];
                    } else {
                        rmax = height[j];
                    }
                    j--;
                }
            }
    
            return total;
        }
    
        public static void main(String[] args) {
            int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
            System.out.println(trap(height));
        }
    }
    
