package HashMap;
import java.util.HashMap;
import java.util.*;
public class HashMapimpement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         HashMap<Integer, Integer> map = new HashMap<>();
//        Map<Integer, Integer> map = new HashMap<>();
        // map always stored element in sorted order
        int[] arr = {34, 56, 1, 1, 4, 5, 89, 90,23};
//        for(int i=0; i<arr.length; i++){
//            map.put(arr[i], map.getOrDefault(arr[i],0) +1);
//        }

        // for each loop
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num: map.keySet()){
            System.out.println(num+" -> "+map.get(num));
        }

    }
}
