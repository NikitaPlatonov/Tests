package org.example.accounts;
import org.example.accounts.Account;

public class Main {
    public static void main(String[] args) {
        Account SavingsAccount = new SavingsAccount("Nikita", 100, 10);
        Account CheckingAccount = new CheckingAccount("Alex", 5000);
        Account CreditAccount = new CreditAccount("Vadim", -1);

        CheckingAccount.pay(5001);

        SavingsAccount.pay(90);

        CreditAccount.pay(1000);

        System.out.println(SavingsAccount.getBalance());

        System.out.println(CheckingAccount.getBalance());

        System.out.println(CreditAccount.getBalance());

        System.out.println();

        CheckingAccount.add(10000);

        System.out.println(CheckingAccount.getBalance());


    }
}