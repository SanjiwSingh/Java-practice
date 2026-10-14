package MemoryManagement;

public class Demo {
    static int a = 10;
    int b = 20;

    static void test() {
        System.out.println("Static test()");
    }

    void disp() {
        System.out.println("Non-static disp()");
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        Demo d = new Demo();

        test();
        d.disp();
    }
}
//Static and non-static members
