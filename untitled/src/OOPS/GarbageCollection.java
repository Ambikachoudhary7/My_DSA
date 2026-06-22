package OOPS;
import java.util.*;
class An{
    String name;
    public An(String name){
        System.out.println("object been created");
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("object is destroyed");
    }
}
public class GarbageCollection {
    public static void main(String[] args) {
        // Garbage Collection:- it works when we create multiple of object in heap with same reference variable
        // and reference variable is pointing current object at that time heap have stored many garbage
        // for destroyed them he need to tell not how to do it is automatically destroyed all the garbage.
        An obj;
        for(int i=0; i<100000000; i++){
            obj = new An("Random objects");
        }
    }
}
