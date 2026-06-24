package SingletonClass;
public class Singletonclass {
    private Singletonclass(){

    }
    private  static Singletonclass instance;
    public static Singletonclass getInstance(){
        // check instance is created
        if(instance==null){
            instance = new Singletonclass();
        }
        return instance;
    }

}
