package Recursion;
import java.util.*;
public class ReverseArray {
   public static void reverse(int i, int j, int[] arr){
       if(i>=j) return;
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
       reverse(i+1, j-1, arr);
   }

    public static void main(String[] args) {

        int[] arr = {2, 5, 3, 8, 12, 90};
        reverse(0, arr.length-1, arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}