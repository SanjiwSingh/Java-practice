package Chaining;
class Order{
	Order(){
		System.out.println("Burger");
	}
	Order(int x){
		this();
		System.out.println("Fries");
	}
	Order(double d){
		this(10);
		System.out.println("COke");
	}
}
public class Mainclass2 {
    public static void main(String[] args) {
        Order o = new Order(2.4);
    }
  
}
