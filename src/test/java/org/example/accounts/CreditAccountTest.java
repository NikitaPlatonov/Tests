package org.example.accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {
    CreditAccount creditAccount = new CreditAccount("Jastin Biber", -1000);

    @Test
    // The pay() method
    // The method checks the operation of the condition . Money cannot be debited if the balance is negative.
    void DebitingMoneyFromACreditAccount() {
        long amount = 1000;
        boolean expect = false;
        Assertions.assertEquals(expect, creditAccount.pay(amount));
    }
}