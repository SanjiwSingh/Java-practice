package Chaining;

class Student {
    Student() {
        System.out.println("Personal Details : 6 lines");
        System.out.println("Academic Details : 12 lines");
    }

    Student(boolean exp) {
        this();
        System.out.println("Experience details: 6 lines");
    }
}

public class Mainclass4 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("_____________________");
        Student s1 = new Student(true);

    }

}
