package Sorting;
import java.util.*;
public class BubbleSort2ndMethod {
    public static void bubble(int[] arr){
        for(int i = arr.length-1; i>=0; i--){
            int swap = 0;
            for(int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j] = temp;
                    swap = 1;
                }
            }
            if(swap==0) break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23, 4, 6, 12, 1, -1, 3, 0};
        bubble(arr);
        for(int num: arr){
            System.out.println(num);
        }
    }
}
