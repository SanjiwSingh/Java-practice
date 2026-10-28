package UpCasting;
class Demo{
	
}
class Sample extends Demo{
	
}
public class Mainclass1 {
   public static void main(String[] args) {
		Sample obj = new Sample();
		Demo ref = obj;// UPCASTING : SAMPLE --- DEMO
		System.out.println(obj);
		System.out.println(ref);
	} 
}
