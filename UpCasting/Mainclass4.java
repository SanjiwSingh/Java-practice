package UpCasting;
class A {
	void test() {
		System.out.println("test execute()...........");
	}
}
class B extends A{
	void disp() {
		System.out.println("disp execute()...........");
	}
}
class C extends B{
	void play() {
		System.out.println("play execute()......");
	}
   
}
public class Mainclass4 {
    	public static void main(String[] args) {
		C c1 = new C();
		c1.test();
		c1.disp();
		c1.play();
		System.out.println("______________________");
		
		B b1 = c1;// UPCASTING C ----->B
		b1.disp();
		b1.test();
		System.out.println("______________________");
		
		A a1 = b1;// UPCASTING B---->A
		a1.test();
		
		A a2 = c1;// upcasting c---->a
		a2.test();
		
		
	}
}
