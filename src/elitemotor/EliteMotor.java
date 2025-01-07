package elitemotor;

import java.util.Scanner;

interface Utility {

    public void getDetails();

    public void setDetails();
}

public class EliteMotor {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employees employee[] = new Employees[5];
        Bike bike[] = new Bike[5];
        int bike_counter = 0;
        int showroom_counter = 0;
        int employees_counter = 0;

        while (true) {
            System.out.println("========== WELCOME TO ELITE MOTORS==========");
            System.out.println("============================================");
            System.out.println("1. Add Showroom");
            System.out.println("2. Add Employee");
            System.out.println("3. Add new Bike");
            System.out.println("4. Get Showroom");
            System.out.println("5. Get Employee");
            System.out.println("6. Get Bike");
            System.out.println("0. Exit");
            System.out.println("============================================");
            System.out.print("Enter youe choice : ");
            int ch = sc.nextInt();
            if (ch == 0) {
                System.out.println("");
                exit();
                return;
            }
            while (ch != 9) {
                switch (ch) {
                    case 1:
                        showroom[showroom_counter] = new Showroom(sc);
                        showroom[showroom_counter].setDetails();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        ch = sc.nextInt();
                        break;
                    case 2:
                        employee[employees_counter] = new Employees(sc);
                        employee[employees_counter].setDetails();
                        employees_counter++;
                        System.out.println();
                        System.out.println("2].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        ch = sc.nextInt();
                        break;
                    case 3:
                        bike[bike_counter] = new Bike(sc);
                        bike[bike_counter].setDetails();
                        bike_counter++;
                        System.out.println();
                        System.out.println("3].ADD NEW CAR");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        ch = sc.nextInt();
                        break;
                    case 4:
                        if (showroom_counter == 0) {
                            System.out.println("No show room Available");
                        } else {
                            for (int i = 0; i < showroom_counter; i++) {
                                showroom[i].getDetails();
                                System.out.println();
                                System.out.println();
                            }
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        ch = sc.nextInt();
                        break;
                    case 5:
                        if (employees_counter == 0) {
                            System.out.println("No show Employee Available");
                        } else {
                            for (int i = 0; i < employees_counter; i++) {
                                employee[i].getDetails();
                                System.out.println();
                                System.out.println();
                            }
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        ch = sc.nextInt();
                        break;
                    case 6:
                        if (bike_counter == 0) {
                            System.out.println("No show Bike Available");
                        } else {

                            for (int i = 0; i < bike_counter; i++) {
                                bike[i].getDetails();
                                System.out.println();
                                System.out.println();
                            }
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        ch = sc.nextInt();
                        break;
                    case 0:
                        exit();
                        return;
                    default:
                        System.out.println("Inavlid Choice!!!");
                        break;
                }
            }
        }

    }

    static void exit() throws InterruptedException {
        System.out.print("Existing System ");
        for (int i = 0; i < 7; i++) {
            System.out.print(". ");
            Thread.sleep(300);
        }
        System.out.println("");
    }

}
