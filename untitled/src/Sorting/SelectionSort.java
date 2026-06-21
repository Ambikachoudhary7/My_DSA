package Sorting;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 3, 5, 78, 4, 7, 1};
        for(int k: arr){
            System.out.print(k+" ");
        }
        System.out.println();
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
        }
        for(int num: arr) System.out.print(num+" ");
    }
}
