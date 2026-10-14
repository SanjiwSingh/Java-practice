package MemoryManagement;

public class Delta {
    static int x = 10;
    int y = 20;

    static void check() {
        System.out.println("Static check()");
    }

    void drive() {
        System.out.println("Non-static drive()");
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {
        Delta d1 = new Delta();
        Delta d2 = new Delta();

        check();
        d1.drive();
        d2.drive();
    }

}
//Creating multiple objects
