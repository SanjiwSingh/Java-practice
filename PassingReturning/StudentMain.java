package PassingReturning;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = College.createStudent();
        College.showStudentDetails(s1);
        System.out.println("____________________");
        Student s2 = College.createStudent();
        College.showStudentDetails(s2);
        System.out.println("____________________");
    }
    
}
