package Constructor;

public class Mainclass4 {
    public static void main(String[] args) {
        Utility ref = new Utility();
        System.out.println(ref.a);
        System.out.println(ref.b);
        System.out.println(ref.c);
        
    }
    
}
// ?Zero Argument constructor
class Utility {
    int a;
    double b;
    char c;
    Utility(){
        a =30;
        b = 7.9;
        c = 'J';
    }
}
