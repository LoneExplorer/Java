package ch11q3;



public class CheckingAccount extends Account {

    private double overdraft;

    public CheckingAccount() {
        super();
        overdraft = 100;
    }

    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double withdraw) {
        if (super.getBalance() == -overdraft) {
            System.out.println("You have withdrawn too much money and exceeded your overdraft");
        } else {
            super.withdraw(withdraw);
        }

    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    @Override
    public String toString() {
        return "Account Information:" + "\nID: " + super.getId() + "\nBalance: " 
                + super.getBalance()+ "\nAnnualInterst Rate: " + 
                super.getAnnualInterestRate()+ "\nOverdraft Limit: " + 
                this.getOverdraft() + "\nLog:" + super.getLog();
    }

}
