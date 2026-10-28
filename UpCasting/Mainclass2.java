package UpCasting;
class Alpha{
	void test() {
		System.out.println("Executing test()....");
	}
}
class Beta extends Alpha{
	void disp() {
		System.out.println("Executing disp()....");
	}
}
public class Mainclass2 {
    public static void main(String[] args) {
		Beta b = new Beta();
		b.test();
		b.disp();
		System.out.println("_____________________");
		
		Alpha a = b; // UPCASTING : BETA ----ALPHA
		a.test();
		//a.disp(); // CTE : after upcasting we can not access sub-class properties
	}
}
