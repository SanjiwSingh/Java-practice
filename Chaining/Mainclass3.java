package Chaining;
class Amazon{
	Amazon(){
		System.out.println("Initialized shopping(100 Lines)");
	}
	Amazon(double fees){
		this();
		System.out.println("Initialized Video(100 lines)");
		System.out.println("Initialized Music(100 lines)");
	}
}
public class Mainclass3 {
    public static void main(String[] args) {
		Amazon a = new Amazon();
		System.out.println("_____________________");
		Amazon b = new Amazon(200.4);
	}
    
}
