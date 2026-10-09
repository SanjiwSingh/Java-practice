package String;

public class IndexOf {
    public static void main(String[] args) {
        String str = "Karnataka";
        System.out.println(str.indexOf('n'));
        System.out.println(str.indexOf('t'));
        // System.out.println(str.indexOf('t'));

        int p = str.indexOf('a');
        int q = str.indexOf('a', p+1);
        int r = str.indexOf('a', q+1);
        int s = str.indexOf('a', r+1);

      System.out.println("1st : " + p + "\n2nd : " + q + "\n3rd : " + r + "\n4th : " + s);



       

    }
}
