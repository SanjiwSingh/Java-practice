package PassingReturning;

public class BiriyaniMain {
    public static void main(String[] args) {
        Biriyani b1 = BiriyaniHotel.createBiriyani();
		BiriyaniHotel.showBiriyaniDetails(b1);
		
		System.out.println("________________________");
		Biriyani b2 = BiriyaniHotel.createBiriyani();
		BiriyaniHotel.showBiriyaniDetails(b2);
    }
    
}
