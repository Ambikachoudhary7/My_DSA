package Recursion;
import java.util.*;
public interface PrintNto1 {
    public static void reverse(int count, int n){
        if(count==0) return;
        System.out.println(count);
        reverse(count-1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n, 0);
    }
}
