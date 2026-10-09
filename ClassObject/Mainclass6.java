package ClassObject;

public class Mainclass6 {
    public static void main(String[] args) {
        Rectangle r1 =  new Rectangle();
        r1.length = 15;
        r1.breadth = 6;

        r1.area();
        r1.perimeter();

        
    }
    
}
class Rectangle{
    double length;
    double breadth;


    void area() {
        System.out.println("Area = "+(length + breadth));
    }
    void perimeter() {
        System.out.println("perimeter = "+ 2* (length+ breadth));
    }
}