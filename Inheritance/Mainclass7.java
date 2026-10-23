package Inheritance;
class Watch{
	void time() {
		System.out.println("Showing time");
	}
}
class SmartWatch extends Watch{
	void notification() {
		System.out.println("Showing notification");
	}
}
public class Mainclass7 {
    	public static void main(String[] args) {
		SmartWatch s = new SmartWatch();
		s.time();
		s.notification();
	}
}
