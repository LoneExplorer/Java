package ch11q3;

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date datecreated;
    private String Log;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        datecreated = new Date();
        Log = "Account created on " + datecreated;
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        datecreated = new Date();
        Log = "Account created on " + datecreated + " with a balance of " + this.balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDate() {
        return datecreated;
    }

    public double percentConvert(double percent) {
        return percent / 100;
    }

    public double percentRevert(double percent) {
        return percent * 100;
    }

    public double getMonthlyInterestRate() {
        double MonthlyInterest = this.percentConvert(annualInterestRate) / 12;
        return this.percentRevert(MonthlyInterest);
    }

    public double getMonthlyInterest() {
        double MonthlyInterest = this.getMonthlyInterestRate();
        return this.percentConvert(MonthlyInterest) * balance;
    }

    public void withdraw(double withdraw) {
        balance -= withdraw;
        Log += "\nWithdraw of " + withdraw + " made on " + new Date()
                + " to create a balance of " + balance;
    }

    public void deposit(double deposit) {
        balance += deposit;
        Log += "\nDeposit of " + deposit + " made on " + new Date()
                + " to create a balance of " + balance;
    }

    public String getLog(){
        return Log;
    }
    @Override
    public String toString() {
        return "Account Information:" + "\nID: " + id + "\nBalance: " + balance
                + "\nAnnualInterst Rate: " + annualInterestRate + "\nLog:" + Log;
    }
}
