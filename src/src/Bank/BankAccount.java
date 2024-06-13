package src.src.Bank;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다.");
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        } else if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void checkBalance() {
        System.out.println("현재 잔고: " + balance + "원");
    }
}
