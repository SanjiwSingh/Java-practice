package MemoryManagement;

public class Beta {
     static int num = 100;
    int val = 200;

    static void run() {
        System.out.println("Static run()");
    }

    void push() {
        System.out.println("Non-static push()");
        System.out.println("val = " + val);
    }

    public static void main(String[] args) {
        Beta ref = new Beta();

        System.out.println("num = " + Beta.num);
        System.out.println("val = " + ref.val);

        Beta.run();
        ref.push();
    }
}

//Static and instance variables
