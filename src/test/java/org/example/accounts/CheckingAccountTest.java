package org.example.accounts;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {
    CheckingAccount checkingAccount = new CheckingAccount("Petya", 100);

    @Test
    @Disabled("The test checks the method for adding a negative number to the balance. Rewrite the balance replenishment conditions in (CheckingAccount class -> public boolean pay method)")
    // The pay() method
    void topUpTheBalanceWithANegativeNumber() {
        long amount = -1000;
        checkingAccount.pay(amount);
        boolean check = false;
        Assertions.assertEquals(check, checkingAccount.pay(amount));

    }

}