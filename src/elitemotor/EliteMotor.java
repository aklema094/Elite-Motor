package elitemotor;

import java.util.Scanner;

public class EliteMotor {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========== WELCOME TO ELITE MOTORS==========");
            System.out.println("============================================");
            System.out.println("1. Add Showroom");
            System.out.println("2. Add Employee");
            System.out.println("3. Add new Bike");
            System.out.println("4. Get Showroom");
            System.out.println("5. Get Employee");
            System.out.println("6. Get Bike");
            System.out.println("7. Exit");
            System.out.println("============================================");
            System.out.print("Enter youe choice : ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("");
                    exit();
                    return;
                default :
                    System.out.println("Inavlid Choice!!!");
                    break;
            }
        }

    }
   static void exit() throws InterruptedException{
          System.out.print("Existing System ");
       for (int i = 0; i < 7 ; i++) {
           System.out.print(". ");
           Thread.sleep(300);
       }
       System.out.println("");
   }

}
