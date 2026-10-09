package ClassObject;

public class Mainclass1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rama";
        s1.cgpa = 9.7;
        
        s1.listen();
        s1.write();
        System.out.println("--------------------");

         Student s2= new Student();
        s2.name = "Sita";
        s2.cgpa = 9.8;
        
        s2.listen();
        s2.write();
        
    }
    
}
class Student{
    String name;
    double cgpa;

    void listen(){
        System.out.println(name + "is listen   ");
    }
    void write(){
         System.out.println(name + "is  the write their cgpa is "+cgpa);
    }
}
