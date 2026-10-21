package PassingReturning;

import java.util.Scanner;

public class Company {
    static void showEmployeeDetails(Employee e){
        if(e!= null){
            System.out.println("Employee id: "+e.id);
            System.out.println("Employee name: "+e.name);
            System.out.println("Employee salary : "+e.salary);

        }else{
            System.out.println("Employee not found");
        }

    }
    static Employee createEmployee(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Employee id: ");
        int id = scn.nextInt();
        scn.nextLine();
        System.out.println("Enter Employee name: ");
        String name = scn.nextLine();
       
        System.out.println("Enter Employee Salary: ");
        double salary = scn.nextDouble();

        Employee e = new Employee(id, name, salary);
        return e;
        
    }
    
}
