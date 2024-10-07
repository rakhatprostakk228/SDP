public class RealBankAccount implements BankAccount {
    private int balance;

    public RealBankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ", remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}