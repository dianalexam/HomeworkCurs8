package com.fasttrackit.Exercise2;

public class BRD implements Bank {
    private final String NAME = "BRD";
    private double withdrawnAmount;
    private double depositedAmount;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double withdrawMoney(double withdrawnAmount) {
        this.withdrawnAmount = withdrawnAmount;
        return withdrawnAmount;
    }

    @Override
    public double depositMoney(double depositedAmount) {
        this.depositedAmount = depositedAmount;
        return depositedAmount;
    }
}
