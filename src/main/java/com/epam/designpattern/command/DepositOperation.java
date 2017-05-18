package com.epam.designpattern.command;

public class DepositOperation implements Operation {

    private final int count;
    private final BankAccount bankAccount;

    public DepositOperation(int count, BankAccount bankAccount) {
        this.count = count;
        this.bankAccount = bankAccount;
    }

    @Override
    public void commit() {
        bankAccount.setAmount(bankAccount.getAmount() + count);
    }

    @Override
    public void rollaBack() {
        bankAccount.setAmount(bankAccount.getAmount() - count);
    }
}
