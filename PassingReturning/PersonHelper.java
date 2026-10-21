package PassingReturning;

import java.util.Scanner;

public class PersonHelper {
    static void showPersonDetails(Person p) {
		if(p != null) {
			System.out.println("Age : " +p.age);
			System.out.println("Height : " +p.height);
		}
	}
	
	static Person createPerson() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = scn.nextInt();
		System.out.println("Enter height");
		double height = scn.nextDouble();
		
		Person p = new Person(age,height);
		return p;
	}

    
}
