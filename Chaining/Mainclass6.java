package Chaining;

class Demo {
    Demo() {
        System.out.println("Demo() constructor");
    }

}

class Sample extends Demo {
    Sample() {
        super();// here programmer is explicitly doing constructor
        System.out.println("Sample constructor");
    }
}

public class Mainclass6 {
    public static void main(String[] args) {
        Sample s = new Sample();
    }
}
