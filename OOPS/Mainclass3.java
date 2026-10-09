package OOPS;

public class Mainclass3 {
    public static void main(String[] args) {
        System.out.println(Alpha.p);
        System.out.println(Alpha.q);

        Alpha.help();
        Alpha.send();
        
    }
    
}
class Alpha{
    static  int p = 200;
    static String q = "Java";

    static void help(){
        System.out.println("Execute help().....");
    }
    static void send() {
        System.out.println("Execute send()......");
    }
}
