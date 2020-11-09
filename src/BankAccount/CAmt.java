package BankAccount;
public class CAmt {
    protected int acc_no;
    protected double bal;
    public CAmt(int acc_no) {
        this.acc_no = acc_no;
    }

    public void deposit(float amt)
    {
        bal = bal +amt;
    }
    protected void withdraw(float amt) throws InsufficientbalanceException
    {
        float amount = 0;
        if (amount < bal)
        {
            bal = bal - amt;
        }
        else {
            float test = (float) (amt - bal);
            throw new InsufficientbalanceException("Error...!! ");
            }
        }
        public int getAcc_no()
        {
        return acc_no;
        }
        public double getBal()
        {
            return bal;
    }

    public void withdrawn(int i) {
    }
}
