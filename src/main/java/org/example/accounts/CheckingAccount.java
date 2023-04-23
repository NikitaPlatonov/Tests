package org.example.accounts;

public class CheckingAccount extends Account{

    public CheckingAccount (String nameOwner, long balance) {
        super(nameOwner, balance);
    }
    private long minBalance = 0;

    @Override
    public boolean pay (long amount) {
        if (getBalance() < amount || getBalance() <= minBalance) {
            return false;
        } else {
            setBalance(- amount);
            return true;
        }
    }
}
