package Constructor;

public class Mainclass3 {
    public static void main(String[] args) {
        Sample ref = new Sample();
        System.out.println(ref.a);
        ref.send();
        
    }
    
}
//? Zero Argument constructor

class Sample {
    int a;

    void send(){
        System.out.println("Executing help()...");
    }
    Sample() {
        System.out.println("Executing constructor...");
        a = 10;
    }
}
