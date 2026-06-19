package Recursion;
import java.util.*;
public class StringPalindrom {
//    public static boolean palindrome(String n, int i, int j){
//        if(i>=j) return true;
//        if(n.charAt(i)!=n.charAt(j)) return false;
//        return palindrome(n,i+1, j-1);
//    }

    // method2
    public static boolean palindrom2(String n, int i){
        if(i>=n.length()/2) return true;
        if(n.charAt(i) != n.charAt(n.length()-i-1)) return false;

        return palindrom2(n, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(palindrom2(n, 0));
        //System.out.println(palindrome(n,0, n.length()-1));
    }
}
