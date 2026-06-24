package Sorting;
import java.util.*;
public class QuickSort {
    public static int partion(int[] arr, int low, int high){
        int pivot = arr[low];
        int i=low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while (arr[j] > pivot && j >= low+1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high){
            int p = partion(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }

    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5,7,9,1,3};
        quickSort(arr, 0, arr.length-1);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
