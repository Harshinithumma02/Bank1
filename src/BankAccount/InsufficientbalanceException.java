package BankAccount;

public class InsufficientbalanceException extends Exception
{
    private float amt;
    public InsufficientbalanceException(float amt)
    {
        this.amt = (float) amt;
    }
    public double getAmt()
    {
        return amt;
    }
    public int getBal() {
        int bal = 0;
        return bal;

    }

}


