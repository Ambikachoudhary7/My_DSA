package Recursion;
import java.util.*;
public class Problem2 {
    public static void Sum(int n, int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        Sum(n-1, sum+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sum(n, 0);
    }
}

