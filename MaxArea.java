//import java.util.*;
 public class MaxArea {
    public static int maxArea(int[] height) {
        int max=0;
        for(int i=0; i<height.length; i++){
            for(int j=i+1;j<height.length;j++){
                int area=(j-i)*Math.min(height[i], height[j]);
                   max = Math.max(max, area);
            }
        }
        return max;
    }
        
    public static void main(String args[]){
        int arr[]={1,8,6,2,5,4,8,3,7};
        int m=maxArea(arr);
        System.out.print(m+" ");
    }
}