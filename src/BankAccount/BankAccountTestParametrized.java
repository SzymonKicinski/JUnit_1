package BankAccount;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParametrized {

    private BankAccount bankAccount;
    private double amount;
    private double expected;
    private boolean branch;

    public BankAccountTestParametrized(double amount, double expected, boolean branch) {
        this.amount = amount;
        this.expected = expected;
        this.branch = branch;
    }

    @Before
    public void before(){
        bankAccount = new BankAccount("Tim", "Sky", 1000.00, BankAccount.CHECKING);
        System.out.println("Running the BankAccountTestParametrized...");
    }

    @Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object [][] {
                {100.00, true, 1100.00},
                {200.00, true, 1200.00},
                {325.14, true, 1325.00},
                {489.33, true, 1480.33},
                {1000.00, true, 2000.00}
        });
    }

    @Test
    public void deposite() throws Exception {
        bankAccount.deposite(amount, branch);
        assertEquals(expected, bankAccount.getBalance(), .01);
    }
}
