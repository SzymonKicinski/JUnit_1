package BankAccount;

public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int typeOfAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeOfAccount;
    }

    public BankAccount(String firstName) {
        this.firstName = firstName;

    }

    // The branch argument is true if the customer is performing the trransaction
    // at branch, with a teller.
    // It's false if the customer is performing the transaction at an ATM
    public double deposite(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    // The branch argument is true if the customer is performing the trransaction
    // at branch, with a teller.
    // It's false if the customer is performing the transaction at an ATM
    public double withDraw(double amount, boolean branch) {
        if ((amount > 500.00) & !branch) {
            throw new IllegalArgumentException("You bastard!");
        }
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    // More methods that use firstName, lastName, balance

    public boolean isChecking() {
        return accountType == CHECKING;
    }

    public boolean isSaving() {
        return accountType == SAVINGS;
    }

    public int getAccountType() {
        return accountType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static int getCHECKING() {
        return CHECKING;
    }

    public static int getSAVINGS() {
        return SAVINGS;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }
}
