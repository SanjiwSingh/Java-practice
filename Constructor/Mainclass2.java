package Constructor;

public class Mainclass2 {
    public static void main(String[] args) {
        Dummy d = new Dummy();
        System.out.println(d.a);
        System.out.println(d.b);
        System.out.println(d.c);
    }
    
}
class Dummy {
    int a;
    boolean b;
    double c;
}

//Default constructor
