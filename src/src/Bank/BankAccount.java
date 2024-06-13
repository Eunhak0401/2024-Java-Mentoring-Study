package src.src.Bank;

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount > balance) {
            System.out.println("잔고 부족");
            System.out.println("부족금액: " + (balance - amount) * (-1) + "원" );
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void checkBalance() {
        System.out.println("잔고> " + balance);
    }
}
