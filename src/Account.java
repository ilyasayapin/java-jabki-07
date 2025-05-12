public class Account {

    private int accountNumber = (int) (Math.random() * 100 + 1);
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Введите положительное число");
        }
        if (this.balance <= amount) {
            throw new IllegalArgumentException("Баланс не может уйти в минус");
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double amount) {
        this.balance += amount;
    }


    public void displayInfo() {
        System.out.printf("Номер счета: %s,\nБаланс счета: %s",
                this.accountNumber,
                this.balance
        );
    }
}
