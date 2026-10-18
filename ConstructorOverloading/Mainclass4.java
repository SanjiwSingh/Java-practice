package ConstructorOverloading;

public class Mainclass4 {
    public static void main(String[] args) {
        Amazon regular = new Amazon();
        System.out.println("------------------------");
        Amazon prime = new Amazon(1499.0);
        
    }
    
}

//Real time example
class Amazon {
    Amazon(){
        System.out.println("Shopping");
    }
    Amazon(double fees){
       System.out.println("shopping");
       System.out.println("Prime video");
       System.out.println("Amazon musics");
    }
}
