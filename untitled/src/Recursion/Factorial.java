package Recursion;
import java.util.*;
public class Factorial {
    public static int factorial(int n){
        if(n==0) return 1; // in factorial this is mai logic beacuse here if i return 0 then something is multiplyed by zero is zero thats. and also fact(0)= 1.
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
