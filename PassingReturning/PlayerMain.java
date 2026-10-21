package PassingReturning;

public class PlayerMain {
    public static void main(String[] args) {
        Player p1 = Dream11.createPlayer();
		Dream11.showPlayerDetails(p1);
		System.out.println("_________________");
		Player p2 = Dream11.createPlayer();
		Dream11.showPlayerDetails(p2);
    }
    
}
