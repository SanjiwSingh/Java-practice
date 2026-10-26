package Chaining;
class City{
	City(){
		System.out.println("Banglore");
	}
	City(int a){
		this();
		System.out.println("Pune");
	}
	City(double d){
		this(10);
		System.out.println("Hyedrabad");
		
	}
	
}
public class Mainclass1 {
    public static void main(String[] args) {
        City c1 = new City(10.5);
    }
    
}
