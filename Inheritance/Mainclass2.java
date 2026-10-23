package Inheritance;
class Demo{
	void test() {
		System.out.println("Executing test()....");
	}
}
class Sample extends Demo{
	void disp() {
		System.out.println("Executing disp().....");
		
	}
}
public class Mainclass2 {
    public static void main(String[] args) {
       Sample s = new Sample(); // SUB-CLASS OBJECT
		s.test();
		s.disp(); 
    }
    
}
