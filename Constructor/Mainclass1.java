package Constructor;

public class Mainclass1 {
    public static void main(String[] args) {
        Demo ref = new Demo ();
        //Creating on object by calling default constructor
        System.out.println(ref.x);
        ref.test();

    }
    
}
class Demo {
    int x = 100;
    void test() {
        System.out.println("Executing test()...");
    }
}
