package PremitiveTypeCasting;

public class Mainclass1 {
    public static void main(String[] args) {
        int a = 10;
        double d = a; // WIDENING: int ----> double
        System.out.println(d);

        char c = 'A';
        int p = c; //  WIDENING: char -----> int
        System.out.println(p);

        long x = 386328l;
        float y = x; //  WIDENING: long ---- float due to precision
        System.out.println(y);
    }
    
}
