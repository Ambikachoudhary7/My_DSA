package OOPS;
import java.util.*;
class Student{
    int roll;
    float marks;
    String name;
}
public class ClassAndObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students();
        // it gives their default value because we not give here value
//        System.out.println(s1.roll);
//        System.out.println(s1.marks);
//        System.out.println(s1.name);
        // put here value
        s1.roll = 1;
        s1.name = "Ambika";
        s1.marks = 90.9f;
        System.out.println(s1.roll);
        System.out.println(s1.marks);
        System.out.println(s1.name);
    }
}
