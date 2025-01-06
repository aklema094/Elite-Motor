
package elitemotor;

import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements Utility {
    
    String id;
    String name;
    int age;
    String dep;
    Employees(Scanner sc){
        super(sc);
       
    }
    @Override
    public void getDetails() {
        System.out.println("Employee Id : "+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Age : "+age);
        System.out.println("Department : "+dep);
        System.out.println("ShowRoom Name : "+sName);

    }

    @Override
    public void setDetails() {
        UUID uid = UUID.randomUUID();
        id = String.valueOf(uid);
        sc.nextLine();
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department : ");
        dep = sc.nextLine();

    }
    
    
}
