
public class BankAccount90 
{
    private int accountNumber;
    private double balance;

    
    public BankAccount90(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    
    public void d(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount);
            displayBalance();
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

   
    public void w(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrew " + amount);
                displayBalance();
            } else {
                System.out.println("Insufficient funds to complete the withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    
    private void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

    
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

   
    public static void main(String[] args) {
        BankAccount90 account = new BankAccount90(12345, 1000.00);
        account.d(600);
        account.w(1100);
        account.w(1650);  
    }
}
