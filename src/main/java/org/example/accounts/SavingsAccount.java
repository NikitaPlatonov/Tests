package org.example.accounts;

public class SavingsAccount extends Account {
    private long minBalance;

    public SavingsAccount (String nameOwner, long balance, long minBalance) {
        super(nameOwner,balance);
        this.minBalance = minBalance;
    }

    @Override
    public boolean pay (long amount) {
        if (minBalance > (getBalance() - amount) || getBalance() < amount) {
            return false;
        } else {
            setBalance(- amount);
            return true;
        }
    }
}

