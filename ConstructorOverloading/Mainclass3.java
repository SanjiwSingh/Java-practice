package ConstructorOverloading;

public class Mainclass3 {
    public static void main(String[] args) {
        Developer d1 = new Developer(10, "java");
         Developer d2 = new Developer("java",10 );
        
    }
    
}
//Sequence
class Developer {
    Developer(int a, String s){
        System.out.println("Front end Developer");
    }
     Developer( String s,int a){
        System.out.println("Back end Developer");
    }
}
