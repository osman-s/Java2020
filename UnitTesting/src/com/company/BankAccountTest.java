package com.company;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account;

    @BeforeAll
    public static void before() {
        System.out.println("This executes before any test cases");
    }

    @BeforeEach
    public void setup() {
        account = new BankAccount("Osman","Hasan",1000,BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @Test
    void deposit() {
//        fail("This test has yet to be implemented");
        double balance = account.deposit(200,true);
        assertEquals(1200,balance,0);
    }

    @Test
    void withdraw() {
        double balance = account.withdraw(600,true);
        System.out.println(balance);
        assertEquals(400,balance,0);
    }

    @Test
    void getBalance_deposit() {
        account.deposit(200,true);
        assertEquals(1200,account.getBalance(),0);
    }

    @Test
    void getBalance_withdraw() {
        account.withdraw(200,true);
        assertEquals(800,account.getBalance(),0);
    }

    @Test
    public void isChecking_true() {
        assertTrue(account.isChecking(),"The Account is NOT a checking account");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Finished executing test.");
    }
    @AfterAll
    public static void after() {
        System.out.println("This executes after all test cases");
    }
}