public class SavingsAccount extends Account{

    private double interestRate;

    private SavingsAccount(double balance, double interestRate) {
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


}
