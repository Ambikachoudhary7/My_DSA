package Recursion;
import java.util.*;
public class Problem3 {
    public static int printSum(int n){
        if(n==0) return 0; // here you see that sum of is always 0 so, at last calling it return the 0 , it helf us sum
        return n+printSum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printSum(n));
    }
}
