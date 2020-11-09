package BankAccount;
import java.util.Scanner;
class BankAccount {
    int acc_no;
    double bal;
    Scanner in = new Scanner(System.in);
    public void deposit() {
        float amount;
        System.out.println("Please enter the amount to be deposited");
        amount = in.nextFloat();
        bal = bal + amount;
        System.out.println("The amount deposited is" + bal);
    }

    void withdraw() throws InsufficientbalanceException {
        float amount;
        System.out.println("Enter the amount to be withdrawn");
        amount = in.nextFloat();
        {
            try {
                if (amount < bal) {
                    bal = bal - amount;
                    System.out.println("The amount withdrawn is: \n Available balance is " + bal);
                } else throw new InsufficientbalanceException("There is no sufficient balance" +  amount);
            } catch (Exception e) {
                System.out.println("Exception occurred..." + e);
            }
        }

    }
}





