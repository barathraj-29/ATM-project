import java.util.*;

public class Atm_project {

    public static void main(String[] args) {

        int pin = 1234;
        int balance = 20000;

        int AddAmount = 0;
        int TakeAmount = 0;

        String name;

        Scanner scanner = new Scanner(System.in);

        // we have to take an input by an user

        System.out.println("Enter your Pin Number :");

        int password = scanner.nextInt();

        if (password == pin) {

            System.out.println("Enter Your Name :");
            name = scanner.next();
            System.out.println("Welcome " + name);

            while (true) {
                System.out.println("Press 1 to Check your balance");
                System.out.println("Press 2 to Add amount");
                System.out.println("Press 3 to Take amount");
                System.out.println("Press 4 to Receive a receipt");
                System.out.println("Press 5 to EXIT");

                int opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Your current balance is : " + balance);
                        break;

                    case 2:
                        System.out.println("How much amount did you want to add to your Account");
                        AddAmount = scanner.nextInt();
                        System.out.println("Successfully credited");
                        balance = AddAmount + balance;
                        // 20000 = 100 + 20000
                        // current balance = 20100
                        break;

                    case 3:
                        System.out.println("How much amount did you want to take ");
                        TakeAmount = scanner.nextInt();
                        if (TakeAmount > balance) {
                            System.out.println("Your balance is insufficient");
                            System.out.println("Try less than your available balance");
                        } else {
                            System.out.println("Successfully taken");
                            balance = balance - TakeAmount;
                            // balance = 10100 = 10100 - 100
                            // balance = 10000
                        }
                        break;

                    case 4:
                        System.out.println("Welcome to Hdfc Atm");
                        System.out.println("Available balance is " + balance);
                        System.out.println("Amount Deposited " + AddAmount);
                        System.out.println("Amount Taken " + TakeAmount);
                        System.out.println("Thanks For Coming");
                        break;
                 

                }

                if(opt == 5){
                    System.out.println("Thank you visiting our ATM");
                    break;
                }
            }

        }


        else{
            System.out.println("Invalid or Wrong pin number !!");
        }

    }
}