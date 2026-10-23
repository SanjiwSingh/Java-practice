package Inheritance;
class Delta{
	 static int val = 100;
}
class Example extends Delta{
	
}
public class Mainclass3 {
    public static void main(String[] args) {
		Example ex = new Example();
		System.out.println(ex.val); // its look like inheritance but not inheritance
	}
}
