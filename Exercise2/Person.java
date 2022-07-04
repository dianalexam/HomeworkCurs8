package com.fasttrackit.Exercise2;

public class Person {
    private Bank mainBank;
    private double balance = 0;

    public Person(Bank bank) {
        this.mainBank = bank;
    }

    public String performDeposit(double depositedAmount) {
        mainBank.depositMoney(depositedAmount);
        balance = balance + depositedAmount;
        return "You've deposited: " + depositedAmount;
    }

    public String performWithdrawal(double withdrawnAmount) {
        if (balance > 0) {
            mainBank.withdrawMoney(withdrawnAmount);
            balance = balance - withdrawnAmount;
            return "You've withdrawn: " + withdrawnAmount;
        }
        return "Cannot perform withdrawal. Current balance is 0.";

    }

    public double checkBalance() {
        if (balance > 0) {
            return balance;
        } else {
            return 0;
        }
    }

    public String checkBankName(){
        return mainBank.getName();
    }


}
