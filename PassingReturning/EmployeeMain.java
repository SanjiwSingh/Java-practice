package PassingReturning;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = Company.createEmployee();
        Company.showEmployeeDetails(e1);
        System.out.println("-------------");
        Employee e2 = Company.createEmployee();
        Company.showEmployeeDetails(e2);
        System.out.println("-------------");
    }
    
}
