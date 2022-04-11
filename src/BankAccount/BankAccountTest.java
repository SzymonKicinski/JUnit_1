package BankAccount;

import org.junit.*;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.*;

public class BankAccountTest {
    private BankAccount  bankAccount;
    private BankAccount  bankAccountSaving;
    private BankAccount  bankAccountChecking    ;
    private BankAccount  bankAccountWithName;
    private static int count;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases . BeforeClass -> Count: " + count++);
    }


    @Before
    public void setup() {
        System.out.println("Running before method ... Before * Count: " + count);
        this.bankAccount = new BankAccount("Tim", "Sky", 1000, BankAccount.CHECKING);
        this.bankAccountChecking = new BankAccount("Tim", "Sky", 1000, BankAccount.CHECKING);
        this.bankAccountSaving = new BankAccount("Tim", "Sky", 1000, BankAccount.SAVINGS);
        this.bankAccountWithName = new BankAccount("Tim");
    }

    @Test
    public void deposite() {
        double balance = bankAccountChecking.deposite(200, false);
        assertEquals(1200.00, balance, 0);
    }

    @Test
    public void withDraw_branch() {
        double balance = bankAccountChecking.withDraw(600, true);
        assertEquals(400.00, balance, 0);

    }


    @Test(expected = IllegalArgumentException.class)
    public void withDraw_Nobranch() {
        double balance = bankAccountChecking.withDraw(600, false );
        assertEquals(400.00, balance, 0);
    }

    @Test
    public void getBalance_deposite() {
        bankAccountChecking.deposite(200, true);
        assertEquals(1200.00, bankAccountChecking.getBalance(), 0);
    }

    @Test
    public void getBalance_withDraw() {
        bankAccountChecking.withDraw(200, true);
        assertEquals(800.00, bankAccountChecking.getBalance(), 0);
    }

    @Test
    public void dummyTest() {
        assertEquals(20, 20);
    }

    @Test
    public void isChecking() {
        assertTrue(bankAccountChecking.isChecking());
    }

    @Test
    public void isSavingPositive() {
        assertTrue(bankAccountSaving.isSaving());

    }

    @Test
    public void isSavingMegative() {
        assertFalse("This test should be false positive", bankAccountChecking.isSaving());
    }

    @Test
    public void depositIsNull() {
        assertNull(bankAccountWithName.getLastName());
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("This executes after all of the test cases ");
        System.out.println("Count: " + count++);
    }

    @After
    public void after() {
        System.out.println("After. Count: " + count++);
    }
}