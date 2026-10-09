package String;

public class Contain {
    public static void main(String[] args) {
        String str = "Engineering";
        System.out.println(str.contains("job"));
        System.out.println(str.contains("ing"));

        // StartWith()
        System.out.println(str.startsWith("eng"));// false
        System.out.println(str.startsWith("Eng"));//true
        
        //EndWith()
        System.out.println(str.endsWith("r ing"));//false
        System.out.println(str.endsWith("ing"));

    }

}
