package PassingReturning;

import java.util.Scanner;

public class College {
    static void showStudentDetails(Student s){
        if(s != null){
            System.out.println("id : "+ s.id);
            System.out.println("name : "+s.name);
        }
    }
    static Student createStudent(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Student id : ");
        int id = scn.nextInt();
        scn.nextLine();
        System.out.println("Enter Student name: ");
        String name = scn.nextLine();

        Student s = new Student(id, name);
        return s; 

    }
    
}
