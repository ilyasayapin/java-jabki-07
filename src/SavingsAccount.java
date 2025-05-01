public class SavingsAccount extends Account {

    private int interestRate;

    public SavingsAccount(double balance, int interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 1000) {
            throw new IllegalArgumentException("Запрет на снятие более 1000р за раз");
        } else {
            super.withdraw(amount);
        }
    }

    public void applyInterest() {
        double newBalance = super.getBalance() * interestRate / 100;
        super.setBalance(super.getBalance() + newBalance);
    }

    @Override
    public void displayInfo() {
        System.out.printf("\nНомер счета: %s,\nПроценты по вкладу: %s,\nБаланс счета: %s",
                super.getAccountNumber(),
                this.interestRate,
                super.getBalance()
        );
    }
}
