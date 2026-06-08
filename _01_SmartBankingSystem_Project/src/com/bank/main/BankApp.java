package com.bank.main;

import java.util.Scanner;
import com.bank.service.BankServiceImpl;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankServiceImpl bank = new BankServiceImpl();

        while (true) {
            System.out.println("\n1.Create Account 2.Login 3.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bank.createAccount();
                    break;
                case 2:
                    bank.login();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
