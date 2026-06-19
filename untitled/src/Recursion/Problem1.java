package Recursion;
import java.util.*;
public class Problem1 {
    public static void reverse(int[] arr, int i){
        if(i>=arr.length/2) return;
        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;
        reverse(arr, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,43, 53, 1, 4, 56, 75, 89};
        reverse(arr, 0);
        for(int num: arr){
            System.out.println(num);
        }
    }
}
