package Inheritance;
///  this is the all properties of parent class
public class Box {
    double l;
    double w;
    double h;

    // these are the type to creating constructor
    Box(){
        this.l = -1;
        this.w = 2;
        this.h = -1;
    }
    // these are the type to creating constructor
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }
    // these are the type to creating constructor
    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    // these are the type to creating constructor
    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
    public void information(){
        System.out.println("Runing box");
    }

}
