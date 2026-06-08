package com.bank.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bank.exception.InsufficientBalanceException;
import com.bank.model.Account;

public class BankServiceImpl implements BankService {

    private Map<Integer, Account> accounts = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Set PIN: ");
        int pin = sc.nextInt();

        accounts.put(accNo, new Account(accNo, name, balance, pin));
        System.out.println("Account Created Successfully!");
    }

    @Override
    public void login() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        Account acc = accounts.get(accNo);

        if (acc != null && acc.getPin() == pin) {
            System.out.println("Login Successful!");
            userMenu(acc);
        } else {
            System.out.println("Invalid Credentials!");
        }
    }

    private void userMenu(Account acc) {
        while (true) {
            System.out.println(
                "\n1.Deposit  2.Withdraw  3.Check Balance  4.Transaction History  5.Logout"
            );

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Amount: ");
                        acc.deposit(sc.nextDouble());
                        System.out.println("Amount deposited successfully.");
                        break;

                    case 2:
                        System.out.print("Enter Amount: ");
                        double amt = sc.nextDouble();
                        if (amt > acc.getBalance()) {
                            throw new InsufficientBalanceException("Insufficient Balance");
                        }
                        acc.withdraw(amt);
                        System.out.println("Amount withdrawn successfully.");
                        break;

                    case 3:
                        System.out.println("Current Balance: " + acc.getBalance());
                        break;

                    case 4:
                        System.out.println("\n---- Transaction History ----");
                        for (var t : acc.getTransactions()) {
                            System.out.println(t);
                        }
                        break;

                    case 5:
                        System.out.println("Logged out successfully.");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    @Override
    public void deposit() {}
    @Override
    public void withdraw() {}
    @Override
    public void checkBalance() {}
}
