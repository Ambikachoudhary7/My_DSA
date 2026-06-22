package OOPS;
import java.util.*;
public class WrapperClass {
//    public static void swap(int a, int b){
//        int temp = a;
//        a = b;
//        b = temp;
//    }
    // using objects
public static void swap(Integer a, Integer b){
    Integer temp = a;
    a = b;
    b = temp;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = 10; // it non-primitive;
//        int b = 20;
//        swap(a, b); // this not swap because in java only call by value happen not reference in primitive data type
//        System.out.println(a+" "+b);
//        Integer a1 = 20; // it behave as object because it is non premitive

        // but in reference we try it is happen or not
        // but in Wrapper class swap is not possible because in object also , it swap in only that method not change the original value .
        // int object only pass reference value.
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a+" "+b);
    }
}
