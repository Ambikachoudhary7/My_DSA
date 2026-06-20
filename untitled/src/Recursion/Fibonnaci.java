package Recursion;
import java.util.*;
public class Fibonnaci {
    public static int fibonacciNumber(int n){
        if(n<=1) return n;
        int last = fibonacciNumber(n-1);
        int slast = fibonacciNumber(n-2);

        return fibonacciNumber(n-1)+fibonacciNumber(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacciNumber(n));
    }
}
