package org.example.accounts;

public class CreditAccount extends Account{
    public CreditAccount (String nameOwner, long balance) {
        super(nameOwner, balance);
    }
    public boolean pay(long amount) {
        if (getBalance() >= 0) {
            setBalance(- amount);
            return true;
        } else {
            return false;
        }
    }

}
