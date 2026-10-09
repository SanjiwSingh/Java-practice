package OOPS;

public class Mainclass7 {
    public static void main(String[] args) {
        System.out.println(Utility.a);

        Utility ref = new  Utility();
        System.out.println(ref.b);
        Utility.test();
        ref.disp();
        
    }
    
}
class Utility {
    static int a = 10;
    int b = 20;


    static void test(){
        System.out.println("Execute test().....");
    }
    void disp() {
        System.out.println("Execute disp()......");
    }
}
