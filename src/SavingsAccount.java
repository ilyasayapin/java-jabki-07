import javax.swing.*;

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

    }


}
