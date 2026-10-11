public class BankAccount {
    String number;
    String name;
    double balance;

    public BankAccount(String number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение: " + amount + "руб. Текущий баланс: " + balance + "руб.");
        } else {
            System.out.println("Ошибка ");
        }
    }

    void with(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снято: - " + amount + "руб. Текущий баланс : " + balance + "руб.");
        } else if (amount > balance) {
            System.out.println("Недостаточно средств " + amount + " руб ");
        } else {
            System.out.println("Ошибка");
        }
    }

    public void show() {
        System.out.println("Счет: " + number + " Владелец: " + name + "Баланс: " + balance + "руб.");
    }
}

class Bank {
    public static void main(String[] args) {
        BankAccount myaccount = new BankAccount("123456789 ", "Владислав Козубовский ", 5000.0);
        myaccount.show();
        myaccount.deposit(2500.50);
        myaccount.with(10000.0);
        myaccount.with(1000.0);
        myaccount.show();
    }
}