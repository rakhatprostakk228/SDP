public class BankAccountProxy implements BankAccount {
    private RealBankAccount realAccount;
    private String password;

    public BankAccountProxy(String password) {
        this.password = password;
        this.realAccount = new RealBankAccount(1000);  // Default balance
    }

    @Override
    public void withdraw(int amount) {
        if (authenticate()) {
            realAccount.withdraw(amount);
        } else {
            System.out.println("Authentication failed.");
        }
    }

    private boolean authenticate() {
        return "secret".equals(password);
    }
}