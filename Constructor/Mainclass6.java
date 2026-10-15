package Constructor;

public class Mainclass6 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, 4.6);
        System.out.println("EID : "+e1.eid + " CTC : "+e1.ctc);
         Employee e2 = new Employee(102, 5.6);
        System.out.println("EID : "+e2.eid+" CTC : "+e2.ctc);
        
    }
}
// ? PARAMETRIZED CONSTRUCTOR

class Employee{
    int eid ;
    double ctc;
    Employee(int arg1, double arg2){
        eid = arg1;
        ctc = arg2;
    }
}
