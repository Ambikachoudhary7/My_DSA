package StaticExample;
public class Human {
    int id;
    String name;
    int salary;
    boolean married;
     static int population; // static variable  it is not depending on object not required to creat object.
    // If a variable is declared static,
    // it is shared equally among all objects of that class.
    // Each object sees and modifies the same variable.
    // we all declare static variable as well as method
    // it only belongs to class not objects

    // why mai function static? -> beacuse java jvm call driectly main method without creating object .
    // if not write static we need to creat object but jvm start with main method but if main method is not static then jvm gives error because it access mai method
    // main method always work with static method or static variable
    // static variable always call by class
    static void message(){

       // System.out.println(this.id); // it error because in static we not use this keyword because it is used in object reference variabl

    }
    public Human(int id, String name, int salary, boolean married){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;
    }
}
