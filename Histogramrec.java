public class Histogramrec {

        public static int largestRectangleArea(int[] heights) {
            int maxArea = 0;
            int n = heights.length;
    
            for (int i = 0; i < n; i++) {
                int minHeight = heights[i];
    
                for (int j = i; j < n; j++) {
                    minHeight = Math.min(minHeight, heights[j]);
                    int width = j - i + 1;
                    int area = minHeight * width;
                    maxArea = Math.max(maxArea, area);
                }
            }
    
            return maxArea;
        }
    
        public static void main(String[] args) {
            int[] histogram = {2, 1, 5, 6, 2, 3};
            System.out.println(largestRectangleArea(histogram));
        }
    }
