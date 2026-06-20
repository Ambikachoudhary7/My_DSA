package HashMap;
import java.util.*;
import java.util.HashMap;
public class WithString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        String[] s = {"madam", "madam", "sister", "sister", "parul"};
//        for(String st: s){
//            map.put(st, map.getOrDefault(st, 0)+1);
//        }

        // using iteration
        for(int i=0; i<s.length; i++){
            map.put(s[i], map.getOrDefault(s[i], 0)+1);
        }
        for(String S: map.keySet()){
            System.out.println(S+"->"+map.get(S));
        }
    }
}
