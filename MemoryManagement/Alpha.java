package MemoryManagement;

public class Alpha {
     static int a = 15;
    int b = 25;

    static void play() {
        int c = 30;
        System.out.println("Executing play()");
        System.out.println("Local variable c = " + c);
    }

    public static void main(String[] args) {
        Alpha.play();

        Alpha x = new Alpha();

        System.out.println("Static variable a = " + Alpha.a);
        System.out.println("Instance variable b = " + x.b);
    }
}
//Static method and local variable
