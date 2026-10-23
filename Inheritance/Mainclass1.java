package Inheritance;

class Parent {
    void pray() {
        System.out.println("Executing pray");
    }
}
class Child extends Parent {
    
}
public class Mainclass1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.pray();
        
        
    }
    
}
