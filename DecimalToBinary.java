import java.util.Scanner;
public class DecimaltoBinary {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
long ans = 0;
long placeValue = 1;
while(n>0) {
int rem = n%2 ;
ans = ans + rem * placeValue;
n = n/2;
placeValue *= 10;
}
System.out.println(ans);

}
}
    

