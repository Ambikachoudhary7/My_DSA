package Recursion;
import java.util.*;
public class Print1toN {
    public static void print1toN( int count ,int n){
        if(count>n){
            return;
        }
        System.out.println(count);
        print1toN(count+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print1toN(0, n);
    }
}
