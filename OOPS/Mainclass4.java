package OOPS;

public class Mainclass4 {
    public static void main(String[] args) {
        System.out.println(new Delta().a);
        new Delta().test();
        
    }
    
}
class Delta {
    int a = 50;
    void test() {
        System.out.println("execute test().....");
    }
}
