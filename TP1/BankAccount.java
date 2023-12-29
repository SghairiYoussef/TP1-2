public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private int balance;

    public BankAccount(int accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Please enter a valid deposit amount.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println("$" + amount + " withdrawn successfully.");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Please enter a valid withdrawal amount.");
        }
    }

    public static void main(String[] args) {
        // Creating a Bank Account object
        BankAccount account = new BankAccount(123456, "John Doe", 1000);

        // Getting account details
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());

        // Depositing and Withdrawing
        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(200);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.withdraw(1500); // Trying to withdraw more than available balance
    }
}
