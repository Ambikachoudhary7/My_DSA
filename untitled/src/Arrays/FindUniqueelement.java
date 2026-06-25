package Arrays;
import java.util.*;
public class FindUniqueelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
//        for(int i=0; i<arr.length; i++){
//            int count = 0;
//            for(int j = 0; j<arr.length; j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//            }
//            if(count<2){
//                System.out.println(arr[i]);
//            }
//        }

        // solving using xor
        int res = 0;
        for(int num: arr){
            res^=num;
        }
        System.out.println(res);
    }
}
