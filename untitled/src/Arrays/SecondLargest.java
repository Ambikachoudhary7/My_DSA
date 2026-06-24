package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2, 4, 34, 67, 0, 89, 2, 1, 90};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                smax = max; // it copy the max value
                max = arr[i];
            }
            if(arr[i]!=max && arr[i]>smax){
                smax = arr[i];
            }
        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]!=max && arr[i]>smax){
//                smax = arr[i];
//            }
//        }
        System.out.println(max);
        System.out.println(smax);
    }
}
