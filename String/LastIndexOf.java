package String;

public class LastIndexOf {
    public static void main(String[] args) {
        String str = "Developer";
        System.out.println(str.lastIndexOf('l'));
         System.out.println(str.lastIndexOf('p'));
         System.out.println(str.lastIndexOf('x'));//-1

         int a = str.lastIndexOf('e');
         int b = str.lastIndexOf('e', a-1);
         int c = str.lastIndexOf('b', b-1);

          System.out.println("1st : " + a+ "\n2nd : " + b + "\n3rd : " + c );
    }
}
