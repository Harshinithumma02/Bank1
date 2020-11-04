package BankAccount;
import java.util.Scanner;
class BankAccount {
    int acc_no;
    double bal;
    Scanner in = new Scanner(System.in);
    public BankAccount()
    {
        System.out.println("Please enter your Account number");
        acc_no = in.nextInt();
        System.out.println("Please enter your Initial balance");
        bal = in.nextDouble();
    }
    public void deposit()
    {
        float amount;
        System.out.println("Please enter the amount to be deposited");
        amount = in.nextFloat();
        bal = bal + amount;
        System.out.println("The amount deposited is" +bal);
    }
    void withdraw()
    {
        float amount;
        System.out.println("Enter the amount to be withdrawn");
        amount = in.nextFloat();
        if (amount<bal) {
            bal = bal-amount;
            System.out.println("The amount withdrawn is: \n Available balance is " + bal);
        } else {
            System.out.println("Error!! Insufficient balance");
        }

    }
}





