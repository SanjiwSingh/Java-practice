package ClassObject;

public class Mainclass3 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.model = "Iphone 18";
        m1.price = 1.5;
        m1.call();
        m1.message();
        
    }
    
}
class Mobile{
    String model;
    double price;

    void call(){
        System.out.println("call in "+model+ "Its price "+price);
    }
    void message(){
         System.out.println("call in "+model+ "Its price "+price);
    }
}
