package com.company;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {
//        fail("This test has yet to be implemented");
        BankAccount account = new BankAccount("Osman","Hasan",1000,BankAccount.CHECKING);
        double balance = account.deposit(200,true);
        assertEquals(1200,balance,0);
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        fail("This test has yet to be implemented");
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        BankAccount account = new BankAccount("Osman","Hasan",1000,BankAccount.CHECKING);
        account.deposit(200,true);
        assertEquals(1200,account.getBalance(),0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        BankAccount account = new BankAccount("Osman","Hasan",1000,BankAccount.CHECKING);
        account.withdraw(200,true);
        assertEquals(800,account.getBalance(),0);
    }

    @org.junit.jupiter.api.Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Osman","Hasan",1000,BankAccount.CHECKING);
        assertTrue(account.isChecking(),"The Account is NOT a checking account");
    }
}