package Inheritance;
// multi-level inheritance
public class BoxPrice extends BoxWeight{
    int price;
    BoxPrice(){
        this.price = -2;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.price = other.price;
    }
    public BoxPrice(double l, double w, double h, double weight, int price){
        // super(); /// without argument calling
        super(l, w, h, weight);//  what is this ? call the parent class constructor
        // ued to initalize values of parent in parent class
        this.price = price;
    }
    public BoxPrice(double side, double weight, double cost){
        super(side, weight);
        this.price = price;
    }

}
