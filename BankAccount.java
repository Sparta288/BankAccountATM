public class BankAccount {

    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    public BankAccount(String firstName, String lastName, int accountID, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = balance;
    }

    public BankAccount() {

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public double bankAccount() {
        balance = getBalance();
        return balance;

    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;

    }

    public String getFirstName(String f_name) {
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

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public String AccountSummary() {
        System.out.println("Name: " + firstName + "" + lastName);
        System.out.println("Account: " + accountID);
        System.out.println("Balance: $" + balance);
        return " ";
    }

}


