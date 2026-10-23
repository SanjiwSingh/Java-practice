package Inheritance;
class AdobeFree{
	void read() {
		System.out.println("Reading PDF Docs");
	}
}
class AdobePaid extends AdobeFree{
	void edit() {
		System.out.println("Editing pdf docs");
	}
}
public class Mainclass6 {
    public static void main(String[] args) {
		AdobePaid paid = new AdobePaid();
		paid.read();
		paid.edit();
		
		AdobeFree free = new AdobeFree();
		free.read();
		
	}
}
