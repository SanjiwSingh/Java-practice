package Chaining;

class Delta {
    Delta() {
        System.out.println("Delta() constructor");
    }

    Delta(int x) {
        System.out.println("Delta(int) constructor");
    }
}

class Example extends Delta {
    // here compiler implicitly performs constructor chaining with Zero-arg
    // constructor

    Example() {
        System.out.println("Example() constructor");
    }

}

public class Mainclass7 {
    public static void main(String[] args) {
        Example e = new Example();
    }
}
