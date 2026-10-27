package PremitiveTypeCasting;
class Demo{
	void test(float arg) {
		System.out.println("Arguement value : "+arg);
	}
}
public class Mainclass2 {
    public static void main(String[] args) {
        Demo ref = new Demo();
		ref.test(2.3f);
		ref.test(10);// Auto -Widening: int ---->float
		ref.test('A'); // Auto -Widening : char ----> float
		
    }
    
}
