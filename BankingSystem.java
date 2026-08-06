import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial account balance: ");
        double balance = sc.nextDouble();

        int choice;

        do {
            System.out.println("\n----- Banking Menu -----");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Check Balance");
            System.out.println("4 - Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmt = sc.nextDouble();
                    balance += depositAmt;
                    balance += balance * 0.025; // 2.5% interest
                    System.out.println("Deposit successful. Updated Balance (with interest): " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmt = sc.nextDouble();
                    if (withdrawAmt <= balance) {
                        balance -= withdrawAmt;
                        balance += balance * 0.025; // 2.5% interest
                        System.out.println("Withdrawal successful. Updated Balance (with interest): " + balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 3:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}