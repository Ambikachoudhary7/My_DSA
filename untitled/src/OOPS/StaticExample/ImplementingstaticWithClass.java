package OOPS.StaticExample;
//class Test{
//    String name;
//        public Test(String name){
//            this.name = name;
//        }
//    }
public class ImplementingstaticWithClass {
    static class Test{  // it is not depends on object of main class it is independent
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test  a = new Test("Ambika");
        Test b = new Test("kunal");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
//static class A{
//    we cannot create class outside the mai class
//}
