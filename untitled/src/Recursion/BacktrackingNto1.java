package Recursion;
import java.util.*;
public class BacktrackingNto1 {
    public static void backtracking(int i, int n){
        if(i<1) return;
        System.out.println(i);
        backtracking(i-1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        backtracking(n, n);
    }
}
