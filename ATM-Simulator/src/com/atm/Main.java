package com.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ATMOperationImpl atmOperationImpl = new ATMOperationImpl();
        Scanner scanner = new Scanner(System.in);

        int ATMNUmber = 1234;
        int ATMPin = 1234;
        int amount = 0;

        System.out.print("Enter your ATM number: ");
        int userInputATMNumber = scanner.nextInt();

        System.out.print("Enter your PIN number: ");
        int userInputPINNumber = scanner.nextInt();

        if(userInputPINNumber == ATMPin && userInputATMNumber == ATMNUmber) {
            System.out.println("Welcome to HNB ATM - KOTTAWA Branch");
            while (true) {
                menu();
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        atmOperationImpl.getAccountBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        amount = scanner.nextInt();
                        atmOperationImpl.withdraw(amount);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        amount = scanner.nextInt();
                        atmOperationImpl.deposit(amount);
                        break;
                    case 4:
                        System.out.println("Please review below attached transaction history");
                        atmOperationImpl.transactionHistory();
                        break;
                    default:
                        System.out.println("-----Thank you \nPlease collect your card----");
                        scanner.close();
                        break;
                }
            }
        } else {
            System.out.print("Invalid credentials, try again!");
            System.exit(0);
        }
    }

    public static void menu() {
        System.out.println("-----Please select and option to proceed-----");
        System.out.println("1 to check balance");
        System.out.println("2 to withdraw");
        System.out.println("3 to deposit");
        System.out.println("4 to transaction history");
        System.out.println("5 to exit");
        System.out.print("Enter your choice: ");
    }
}
