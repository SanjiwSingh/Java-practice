package ConstructorOverloading;

public class Mainclass1 {
    public static void main(String[] args) {
        city c1 = new city(10);
        city c2 = new  city(4.5);
        city c3 = new  city("ABCD");
        
    }
    
}
//Type
class city {
    city(int a){
        System.out.println("New york");
    }
    city(double d){
        System.out.println("London");
    }
    city(String s){
        System.out.println("Paris");
    }
}
