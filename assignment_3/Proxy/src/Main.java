public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccountProxy("secret");
        account.withdraw(500);  // Successful
        account.withdraw(600);  // Unsuccessful (Insufficient balance)
    }
}