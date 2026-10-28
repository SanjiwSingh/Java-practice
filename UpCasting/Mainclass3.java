package UpCasting;
class Delta{
	int num = 100;
}
class Example extends Delta{
	int num = 200;
}
public class Mainclass3 {
    public static void main(String[] args) {
		Delta ref = new Example();// upcasting : example ---> delta
		System.out.println(ref);
	
}
}
