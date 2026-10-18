package ConstructorOverloading;

public class Mainclass5 {
    public static void main(String[] args) {
        Nexon N1 = new Nexon(10);
        Nexon N2 = new Nexon(10.9);
        Nexon N3 = new Nexon("pqt"); 
        
    }
    
}
//Real time example
class Nexon{
    Nexon(int a) {
        System.out.println("Petrol engine");
    }
    Nexon(double d) {
        System.out.println("Diesel engine");
    }
    Nexon(String s) {
        System.out.println("electric motor");
    }
}
