public class CreditAccount extends Account{

    private int creditLimit;

    public CreditAccount(double balance, int creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Введите положительное число");
        } else if (super.getBalance() - amount < -this.creditLimit) {
            throw new IllegalArgumentException("Вы превышаете кредитный лимит");
        } super.setBalance(super.getBalance() - amount);
    }

}
