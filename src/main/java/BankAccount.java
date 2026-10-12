public class BankAccount {
    String number;
    String name;
    double balance;

    public BankAccount(String number, String name, double balance) {
        this.number = number;
        this.name = name;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Изначальный баланс не может быть отрецательным ");
        }
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение: " + amount + "руб. Текущий баланс: " + balance + "руб.");
        } else {
            System.out.println("Ошибка ");
        }
    }

    public void withdraw(double amount) {
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
        BankAccount myAccount = new BankAccount("123456789 ", "Владислав Козубовский ", -5000.0);
        myAccount.show();
        myAccount.deposit(2500.50);
        myAccount.withdraw(10000.0);
        myAccount.withdraw(1000.0);
        myAccount.show();
    }
}