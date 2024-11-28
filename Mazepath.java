public class Mazepath {
     public static int maze(int sr, int sc, int er, int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;
        int rightWays=maze(sr, sc+1, er, ec);
        int downWays=maze(sr+1, sc, er, ec);
        int totalWays = rightWays+downWays;
        return totalWays;

    }
    public static void main(String[] args) {
        int ans=maze(0,0,2,2);
        System.out.print(ans+"");

        
    }
    
}
