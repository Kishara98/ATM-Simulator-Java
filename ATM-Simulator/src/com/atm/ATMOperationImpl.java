package com.atm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ATMOperationImpl implements ATMOperation {

    ATM atm = new ATM();
    Map<Double, String> transactions = new HashMap<>();

    @Override
    public double getAccountBalance() {
        System.out.println("Your account balance is: " + atm.getBalance());
        return atm.getBalance();
    }

    @Override
    public double withdraw(double amount) {
        if (amount <= atm.getBalance()) {
            transactions.put(amount, "withdraw");
            atm.setBalance(atm.getBalance() - amount);
            System.out.println("Rs." + amount + " withdraw success");
            return amount;
        } else {
            System.out.println("Insufficient balance");
            System.out.println("Your account balance is: " + atm.getBalance());
            return 0;
        }
    }

    @Override
    public double deposit(double amount) {
        if(amount > 0) {
            atm.setBalance(atm.getBalance() + amount);
            transactions.put(amount, "deposited");
            System.out.println("Rs." + amount + " deposit success");
            return amount;
        } else {
            System.out.println("Please enter a positive value");
            return 0;
        }
    }

    @Override
    public void transactionHistory() {
        for(Map.Entry<Double, String> m: transactions.entrySet()) {
            System.out.println("Rs." + m.getKey() +" " + m.getValue());
        }
    }
}
