package Sorting;
import java.util.*;
public class SelectionDecendingOrder {
    public static void decending(int[] arr){
        for(int i=0; i<arr.length; i++){
            int max = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]>arr[max]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23, 1, 0, 345, -1, 34, 8,90};
        for(int k: arr){
            System.out.print(k+" ");
        }
        System.out.println();
        decending(arr);
        for(int num: arr){
            System.out.print(num+" ");
        }

    }
}
