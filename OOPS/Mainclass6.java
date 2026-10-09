package OOPS;

public class Mainclass6 {
    public static void main(String[] args) {
        Example ref = new Example();
        System.out.println(ref.p);
        System.out.println(ref.q);

        ref.help();
        ref.send();
        
    }
    
}
class Example {
    int p = 15;
    String q = "J";

    void help(){
        System.out.println("execution help()....");
    }
    void send (){
        System.out.println("Execute send()......");
    }
}
