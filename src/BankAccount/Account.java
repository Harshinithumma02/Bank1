package BankAccount;
abstract class Account {
    private int acc_no;
    private double bal;
    Account(int a,double b)
    {
        acc_no = a;
        bal= b;
    }
    abstract void display();
}
abstract class deposit extends BankAccount {
    private int amount;
    private String date;

    deposit(int a, double b) {
        super();
        int amt;
        String d;
    }
}




