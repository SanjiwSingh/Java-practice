package ConstructorOverloading;

public class Mainclass2 {
    public static void main(String[] args) {
        Hotel h1 = new Hotel(10);
        Hotel h2 = new Hotel(12,30);
        Hotel h3 = new Hotel(12,30,40);

        
    }
    
}
//length
class Hotel {
    Hotel(int x){
        System.out.println("Mc Donald");
    }
     Hotel(int x, int y){
        System.out.println("Dominos");
    }
     Hotel(int x, int y, int z){
        System.out.println("kfc");
    }

}
