package org.example.accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {
    SavingsAccount savingsAccount = new SavingsAccount("Nikita", 1000, 100);

    @Test
    // The pay() method

    // The method checks the operation of the Pay method condition.
    // The condition is that you cannot withdraw money if it goes beyond the pre-established minimum balance.
    void DebitingMoneyExceedingTheMinimumBalance() {
        long amount = 1000;
        boolean expect = false;
        Assertions.assertEquals(expect, savingsAccount.pay(amount));
    }
}