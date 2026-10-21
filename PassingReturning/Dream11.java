package PassingReturning;

import java.util.Scanner;

public class Dream11 {
    static void showPlayerDetails(Player p) {
		if(p != null) {
			System.out.println("Jersey Number :"+ p.jerseyNumber);
			System.out.println("Name :"+ p.name);
		}
	}
	
	static Player createPlayer() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter jersey Number :");
		int jerseyNumber = scn.nextInt();
		scn.nextLine();
		System.out.println("Enter player name :");
		String name = scn.nextLine();
		
		Player p = new Player(jerseyNumber, name);
		return p;
	}

    
}
