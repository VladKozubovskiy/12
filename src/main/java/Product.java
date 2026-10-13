public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
        } else {
            System.out.println("Ошибка: цена не может быть отрицательной ");
        }
    }

    public void incrQuantity(int amount) {
        if (amount > 0) {
            this.quantity += amount;
        } else {
            System.out.println("Ошибка: количество для добавления должна быть больше нуля  ");
        }
    }

    public void displayInfo() {
        System.out.println("Информация о товаре ");
        System.out.println("Название: " + name);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Количество на складе:" + quantity + "шт.");
    }

    public static void main(String[] args) {
        Product laptop = new Product("Ноутбук ", 65000.0, 10);
        laptop.displayInfo();
        System.out.println("Меняем цену на ноутбук ");
        laptop.setPrice(59990.0);
        System.out.println("Поступление на склад нового товара (+5 шт.)");
        laptop.incrQuantity(5);
        laptop.displayInfo();
    }
}