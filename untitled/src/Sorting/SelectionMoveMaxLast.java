package Sorting;
import java.util.*;
public class SelectionMoveMaxLast {
    public static void selectionMax(int[] arr){
        // this logic is to move large element in last and coming into downwards
        for(int i= arr.length-1; i>=0; i--){
            int max = i;
            for(int j = 0; j<i; j++){
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
        int[] arr = {23, 1, 45, 2, 0, 345, 6, -1};
        for(int k: arr) System.out.print(k+" ");
        selectionMax(arr);
        System.out.println();
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
