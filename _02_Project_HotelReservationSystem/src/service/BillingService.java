package service;

public abstract class BillingService {

    public abstract double calculate(double baseAmount);

    public double addGST(double amount) {
        return amount + (amount * 0.18);
    }
}
