package ClassObject;

public class Mainclass2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id= 101;
        e1.ctc =3.5;

        e1.work();
        e1.meeting();

        System.out.println("-----------------------");

         Employee e2 = new Employee();
        e2.id= 102;
        e2.ctc =42.5;

        e2.work();
        // e2.meeting();
        
    }
    
}
class Employee {
    int id;
    double ctc;

    void work(){
        System.out.println("Employee is working the EMP-ID is "+id);
    }
    void meeting(){
         System.out.println("Employee is meeting the ctcis "+ctc);
    }
}
