package SingletonClass;

public class Main {
    public static void main(String[] args) {
        Singletonclass obj = Singletonclass.getInstance();
        // here why we not use new because we creating static and calling class name
        Singletonclass obj2 = Singletonclass.getInstance();
        Singletonclass obj3 = Singletonclass.getInstance();

        // all three reference variable are pointing to just one object that is called singleton class
        // in this you not call constructor and cannot create object

    }
}
