package OOPS;

public class Mainclass2 {
    public static void main(String[] args) {
        System.out.println(Sample.x);
        System.out.println(Sample.y);

        Sample.disp();
        Sample.play();
        
    }
    
}
class Sample{
    static double x = 4.4;
    static char y = 'J';

   static void disp() {
    System.out.println("Execute disp()......");
   }
   static void play() {
    System.out.println("Execute disp()....");
   }
}
