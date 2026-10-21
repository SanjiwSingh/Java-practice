package PassingReturning;

import java.util.Scanner;

public class BiriyaniHotel {
    static void showBiriyaniDetails(Biriyani b) {
		if(b != null) {
			System.out.println("Quantity :"+ b.qty);
			System.out.println("Price :"+ b.price);
		}
	}
	
	static Biriyani createBiriyani() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Quantity");
		int qty = scn.nextInt();
		double price = qty * 200;
		
		Biriyani b = new Biriyani(qty,price);
		return b;
	}
}
