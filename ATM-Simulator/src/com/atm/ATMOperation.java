package com.atm;

public interface ATMOperation {

    public double getAccountBalance();
    public double withdraw(double amount);
    public double deposit(double amount);
    public void transactionHistory();
}
