package OOPS;
import java.util.*;
class Students {
    int roll;
    String name;
    float marks;

    // constructor :- it used because we have no need to define the value of variable after creation object it make code short
    Students(){
        this.name = "Ambika";
        this.roll = 20;
        this.marks = 90;
    }
    void greeting(){
        System.out.println("my name is "+this.name);
    }
    // parameterize constructor
    Students(int roll, String name, float marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks; // this keword is used to refer current object
    }


}
public class Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students();
        System.out.println(s1.name+" "+s1.roll+" "+s1.marks);
        s1.greeting();
        Students ambika = new Students(23, "Ambika", 98);
        System.out.println(ambika.name+" "+ambika.roll+" "+ambika.marks);

    }
}
