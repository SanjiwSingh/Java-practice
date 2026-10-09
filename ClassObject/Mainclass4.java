package ClassObject;

public class Mainclass4 {
    public static void main(String[] args) {
        Vehicle audi = new Vehicle();
        audi.regno ="";
        
    }
    
}
class Vehicle {
    String regno;
    double mileage;
    void drive(){
        System.out.println("Driving vehicle");
        System.out.println("Registration number"+regno);
        System.out.println("Mileage :" +mileage);
    }
}
