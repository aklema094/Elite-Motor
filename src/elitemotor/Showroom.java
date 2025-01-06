package elitemotor;

import java.util.Scanner;

public class Showroom implements Utility {

    String sName;
    String sAddress;
    String mName; // manager name
    String tNoEmp;
    int bikeinStock;
    Scanner sc;

    Showroom(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public void getDetails() {

        System.out.println("ShowRoom Name : " + sName);
        System.out.println("ShowRoom Address : " + sAddress);
        System.out.println("Manager Name : " + mName);
        System.out.println("Total No Of Employees : " + tNoEmp);
        System.out.println("Total Bike in Stock : " + bikeinStock);

    }

    @Override
    public void setDetails() {
        sc.nextLine();
        System.out.print("Enter Showroom name : ");
        sName = sc.nextLine();
        System.out.print("Enter Showroom Address : ");
        sAddress = sc.nextLine();
        System.out.print("Enter Manager Name : ");
        mName = sc.nextLine();
        System.out.print("Total No Of Employees : ");
        bikeinStock = sc.nextInt();

    }

}
