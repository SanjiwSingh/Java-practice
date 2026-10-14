package MemoryManagement;

public class Sample {
    static char ch = 'J';
    double val = 4.5;
    static void play() {
        System.out.println("playing...");
    }
    void help() {
        System.out.println("Helping....");
    }
    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println("character =" + Sample.ch);
        System.out.println("value =" +s.val);

        Sample.play();
        s.help();
    }
    
}
//Static and non-static variables
