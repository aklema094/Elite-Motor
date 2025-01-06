package elitemotor;

import java.util.Scanner;

interface Utility {

    public void getDetails();

    public void setDetails();
}

public class EliteMotor {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Showroom shr[] = new Showroom[10];
        Employees empp[] = new Employees[10];
        Bike bkk[] = new Bike[10];
        int is = 0;
        int je = 0;
        int kb = 0;

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
                        shr[is] = new Showroom(sc);
                        shr[is].setDetails();
                        is++;
                        System.out.println("1. Add new Showroom");
                        System.out.println("9. Go to main menu");
                        ch = sc.nextInt();
                        System.out.println("");
                        break;
                    case 2:
                        empp[je] = new Employees(sc);
                        empp[je].setDetails();
                        je++;
                        System.out.println("2. Add new Employee");
                        System.out.println("9. Go to main menu");
                        ch = sc.nextInt();
                        break;
                    case 3:
                        bkk[kb] = new Bike(sc);
                        bkk[kb].setDetails();
                        kb++;
                        System.out.println("3. Add new Bike");
                        System.out.println("9. Go to main menu");
                        ch = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < is; i++) {
                            shr[i].getDetails();
                        }
                        System.out.println("9. Go to main menu");
                        System.out.println("0. Exit");
                        break;
                    case 5:
                        for (int j = 0; j < je; j++) {
                            empp[j].getDetails();
                        }
                        System.out.println("9. Go to main menu");
                        System.out.println("0. Exit");

                        break;
                    case 6:
                        for (int i = 0; i < kb; i++) {
                            bkk[i].getDetails();
                        }
                        System.out.println("9. Go to main menu");
                        System.out.println("0. Exit");
                        break;
                    case 0:
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
