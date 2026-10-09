package String;

public class CharAt {
    public static void main(String[] args) {
        String str = "Developer";
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(2));// They give run time error StringIndexOutOfBoundsException
    }
    
}
