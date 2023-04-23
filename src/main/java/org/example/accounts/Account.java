package org.example.accounts;

public class Account {

    public Account (String nameOwner, long balance) {
        this.nameOwner = nameOwner;
        this.balance = balance;
    }
private String nameOwner;
private long balance;

    public boolean pay (long amount) {
    setBalance(- amount);
    return true;
}
public void add (long amount) {
         setBalance(+ amount);
}
public long getBalance () {
        return balance;
}

public boolean setBalance (long amount) {
        if (amount > 0 || amount < 0) {
            balance += amount;
            return true;
        }
        return false;
}
}
