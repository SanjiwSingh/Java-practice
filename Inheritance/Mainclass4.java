package Inheritance;
class Instagramv1 {
	void test() {
		System.out.println("Insta post");
	}
}
class Instagramv2 extends Instagramv1{
	void messager() {
		System.out.println("Insta Message");
	}
}
public class Mainclass4 {
    public static void main(String[] args) {
		 Instagramv2 ref = new Instagramv2();
		 ref.test();
		 ref.messager();
		 
	}
}
