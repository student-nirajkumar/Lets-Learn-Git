public class QueueVisibility {
        public static int[] canSeePeople(int[] heights) {
            int n = heights.length;
            int[] answer = new int[n];
    
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    boolean visible = true;
                    for (int k = i + 1; k < j; k++) {
                        if (heights[k] >= Math.min(heights[i], heights[j])) {
                            visible = false;
                            break;
                        }
                    }
                    if (visible) {
                        answer[i]++;
                    }
                }
            }
    
            return answer;
        }
    
        public static void main(String[] args) {
            int[] heights = {10, 6, 8, 5, 11, 9};
            int[] output = canSeePeople(heights);
            
            for (int count : output) {
                System.out.print(count + " ");
            }
        }
    
    
}
