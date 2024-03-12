import java.util.Scanner;

public class ATM_Transaction {
    public static void main(String args[]) {
        int balance = 5000, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Select the Account type:");
            System.out.println("choose 1 for Checking Account");
            System.out.println("choose 2 for Savings Account");
            System.out.println("choose 4 for Exit");
            int selection = s.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Please Enter the Account Number:");
                    int acc1 = s.nextInt();
                    System.out.println("Please Enter the Pin Number:");
                    int pin1 = s.nextInt();
                    break;

                case 2:
                    System.out.println("Please Enter the Account Number:");
                    int acc = s.nextInt();
                    System.out.println("Please Enter the Pin Number:");
                    int pin = s.nextInt();
                    break;
                case 3:
                    System.out.println("Thankyou for choosing this ATM");
                    break;
                default:
                   System.out.println("Please enter a valid option");

            }

            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = s.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully depsited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}