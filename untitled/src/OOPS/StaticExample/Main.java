package OOPS.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human rahul = new Human(12,"Rahul", 15000, false);
        Human ra = new Human(14,"Rsahil", 15000, true);
        System.out.println(Human.population);
        System.out.println(Human.population);
        //Note:- when you declare , modifing and access the static variable not use a reference variable of object.
        // like this System.out.println(rahul.population);. we access class name
    }
    static void fun(){
        //greeting(); // it give error becuse this method is not static it need to create object and it depends on instance variable,
        // but the main method is static is it not depends on instances show it give error
        Main obj = new Main(); // here we creat reference variable then it executed
        obj.greeting();
    }
    void greeting(){
        System.out.println("hello");
        fun(); // it doesnt give error because it is static it calls anywhere.
        // you call static method in non static method
        // but not call non static method in static method without creating object
        star(); // this method not need to create because it calling in greeting and this method have to create object so it also include them
    }
    void star(){
        System.out.println("Saurabh");
    }
}
