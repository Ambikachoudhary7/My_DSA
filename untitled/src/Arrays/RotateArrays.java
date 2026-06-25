package Arrays;

public class RotateArrays {
    public static void main(String[] args) {
        int[] arr = {1, 5 , 4, 8, 9, 4,7};
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
