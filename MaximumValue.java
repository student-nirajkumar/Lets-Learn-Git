public class MaximumValue {
    public static void main(String [] args){
        String arr []={"0123", "0023", "456", "00182", "940", "2901"};
        int max=Integer.parseInt(arr[0]);
        String maxs=arr[0];

        for(int i=0; i<arr.length; i++){
            int x=Integer.parseInt(arr[i]);
            if(x>max){
                max=x;
                maxs=arr[i];
            }
        }
        System.out.println(maxs);
    }
    
}
