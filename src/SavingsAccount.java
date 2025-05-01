public class SavingsAccount extends Account{

    private double interestRate;

    private SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }


}
