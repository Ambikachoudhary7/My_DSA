package Inheritance;
// in this all properties  of child class
public class BoxWeight extends Box {
    double weight;
    BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight= other.weight;

    }
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
    public BoxWeight(double l, double w, double h, double weight){
       // super(); /// without argument calling
        super(l, w, h);//  what is this ? call the parent class constructor
        // ued to initalize values of parent in parent class
        this.weight = weight;
    }
}
