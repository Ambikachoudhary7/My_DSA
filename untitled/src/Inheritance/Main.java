package Inheritance;

public class Main {
    public static void main(String[] args) {
        // calling constructor without argument
//        Box  box = new Box();
//        Box box1 = new Box(box);
//        System.out.println(box.l+" "+box.w+" "+box.h);

        BoxWeight box2 = new BoxWeight();
        BoxWeight box3 = new BoxWeight(2, 4, 6, 9);
        System.out.println(box3.l+" "+box3.w+" "+box3.h+" "+ box3.weight);

        Box  b = new BoxWeight(2, 4, 5, 8); // in this is correct because child have idea for his parent
        // and he take all properties of father and he have all idea of parent class .
        // parent is in stack and he pointing the child object in heap.
        System.out.println(b);


        //BoxWeight b1 = new Box(2, 4, 5); // you cant do it because the parent class have no idea about her child
        // and you not child as refernce and parent to creating object because you are the identification of your father,
        // is not identity of you and parent class have no idea for what you declear in child class thats why error.
       // System.out.println(b1);

        // super class :- it have not idea about what child class contains

        // multi level inheritance
        BoxPrice price = new BoxPrice(5, 8, 700);
    }
}
