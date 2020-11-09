package BankAccount;
abstract class Account {
    private double bal;
    Account(int a,double b)
    {
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


