package Sorting;
import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23, 4, 6, 12, 1, -1, 3, 0};
        bubbleSort(arr);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
