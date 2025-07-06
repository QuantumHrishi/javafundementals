
public class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;//object balance, given when obj is created
    }
    
    public void deposit(double amount) {
        balance += amount; // adding to balance
    }
    
    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount; // taking from balance
        }
    }
    
    public double getBalance() {
        return balance; // method to return current balance
    }
    
    
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);
        System.out.println(account.getBalance());
        account.deposit(50.0);
        System.out.println(account.getBalance());
        account.withdraw(30.0);
        System.out.println(account.getBalance());
    }
}