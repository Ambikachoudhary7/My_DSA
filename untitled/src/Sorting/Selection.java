package Sorting;
import java.util.*;
public class Selection {
    public static void selectionSort(int[] arr){
        // in this alogrithm first we have to find smallest element in array and move it in starting index.
        // this algorithm is also solved in second method like you find largest element and move it in last position
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]  < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int k: arr){
            System.out.print(k+" ");
        }
        selectionSort(arr);
        System.out.println();
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
