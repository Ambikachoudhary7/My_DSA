package OOPS;
import java.util.*;
class A{
    String name;
    A(String name){
        this.name = name;
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = 10; // premitive
       // n = 30; // in final keyword  it is not possible because in primitive it doesnot allow to modification

        // in object non primitive
        final A s = new A("Ambika");
        s.name = "Saurabh"; // but in object it allow to modificatio
       // s = new A("kfsnkfn"); //  but not create to creat new object and reassign it


    }
}
