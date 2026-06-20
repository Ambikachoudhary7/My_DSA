package HashMap;
import java.util.*;
public class WithCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = {'A','c', 'A','B', 'c', 'B', 'd', 'e'};
//        for(int i=0; i<arr.length; i++){
//            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
//        }
        // for each loop
        for(char ch: arr){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char num: map.keySet()){
            System.out.println(num +"->"+ map.get(num));
        }
    }
}
