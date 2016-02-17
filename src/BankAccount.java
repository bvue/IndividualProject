/**
 * Created by Bao on 2/14/2016.
 */
public class BankAccount {

    private String account;
    private double balance;
    private double newBalance;


    /**
     Constructs a bank account without a prameter and a zero balance
     */
    public BankAccount()
    {
        balance = 0;
    }

    /**
     Constructs a bank account with a given balance
     @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    /** Construct a BankAccount object
     * @param accountName name of the account
     * @param initialBalance starting balance
     * @throws IllegalArgumentException if initialBalance &lt; 0
     */
    public BankAccount(String accountName, double initialBalance){
        account = accountName;
        balance = initialBalance;
    }


    /** Returns the owner of this account */
    public String getAccount() {
        return account;
    }

    /** Sets the account name */
    public void setAccount(String account){
        this.account = account;
    }

    /** Returns the current balance */
    public double getBalance() {
        return balance;
    }

    /** Sets the current balance */
    public void setBalance(int balance){
        this.balance = balance;
    }


    /**
     Deposits money into the bank account.
     @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        newBalance = balance + amount;
        balance = newBalance;
    }

    /**
     Withdraws money from the bank account.
     @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {
        newBalance = balance - amount;
        balance = newBalance;
    }

    public String toString() {
        return "BankAccount, " + account + " current balance is $" + balance;
    }
}
