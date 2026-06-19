package Recursion;
import java.util.*;
public class SumoffirstNnumber {
    public static void sum(int n, int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        sum(n-1, sum+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n,0);
    }
}
