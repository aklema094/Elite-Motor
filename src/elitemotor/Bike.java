
package elitemotor;

import java.util.Scanner;

public class Bike extends Showroom implements Utility {
    
    String bName;
    String color;
    String brand;
    int price;

    public Bike(Scanner sc) {
        super(sc);
    }
    public void getDetails(){
        System.out.println("Bike Name : "+bName);
        System.out.println("Bike Color : "+color);
        System.out.println("Brand Name : "+brand);
        System.out.println("Price : "+price);
        
    }
    
    public void setDetails(){
        
        sc.nextLine();
        System.out.print("Enter Bike Name : ");
        bName = sc.nextLine();
        System.out.print("Enter Bike Color : ");
        color = sc.nextLine();
        System.out.print("Enter Brand Name : ");
        brand = sc.nextLine();
        System.out.print("Enter Price : ");
        price = sc.nextInt();
        bikeinStock++;
        
    }
   
}
