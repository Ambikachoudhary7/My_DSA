package Arrays;

public class SecondlargestAndSecondSmallest {
    public static int second(int[] arr){
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
        return smax;
    }
    public static int Ssmall(int[] arr){
        int small = Integer.MAX_VALUE;
        int s_small = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<small){
                s_small = small;
                small = arr[i];
            }
            if(arr[i]<s_small && arr[i]!=small){
                s_small = arr[i];
            }
        }
        return s_small;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 34, 67, 0, 89, 2, 1, 90};
        int smax = second(arr);
        int Sesmall = Ssmall(arr);
        System.out.print(smax+" "+Sesmall);
    }
}
