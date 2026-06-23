package StaticExample;
 // intialization of static variables
public class StaticBlock {
    static int a = 9;
    static int b = 8;
    static { // it run only once , when the first object is created  i.e when the class loaded first time
        System.out.println("I am block");
        b = a*5;
        //Static Block → 1 baar (class load hote hi) chaha tum kina bhi object bana lo
        //Constructor → Har object ke liye 1 baar
//        static member → class ke naam se access karo.
//        non-static member → object ke through access karo.
        // static class ham main class ko nahi bana bana sakta hai only nested class ko bana sakta hai
    }

     public static void main(String[] args) {
         StaticBlock obj = new StaticBlock();
         System.out.println(obj.a+" "+obj.b); // eska jagha ham bina object ka bhi access kar sakta tha
         //System.out.println(StaticBlock.a+" "+StaticBlock.b); //yaa
         StaticBlock.b+=3;
         System.out.println(obj.a+" "+obj.b);
         StaticBlock obj2 = new StaticBlock();
         System.out.println(obj2.a+" "+obj2.b);
     }
}
