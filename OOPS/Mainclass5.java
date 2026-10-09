package OOPS;

public class Mainclass5 {
    public static void main(String[] args) {
        Beta ref = new Beta();
        System.out.println(ref.x);
        System.out.println(ref.y);

        ref.disp();
        ref.play();
    }
    
}
class Beta {
    double x = 9.1;
    char y = 'J';

    void disp(){
       System.out.println("Execute disp()......");

    }
    void play(){
        System.out.println("Execute play()......");
    }
}
