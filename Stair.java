public class Stair {
    public static int stair(int n){
        if(n==2) return 2;
        if(n==1) return 1;
        return stair(n-1) + stair(n-2);
    }
    public static void main(String[] args) {
        System.out.print(stair(5)+"");
    }
    
}
