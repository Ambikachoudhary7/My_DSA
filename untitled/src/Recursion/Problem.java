package Recursion;
import java.util.*;
public class Problem {
    public static void recursion(int count,int n){
        if(count>n){
            return;
        }
        System.out.println("Ambika");
        recursion(count+1, n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion(0,n);
    }
}
