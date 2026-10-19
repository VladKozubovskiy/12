import net.datafaker.Faker;

import java.util.Scanner;

public class FakerDemo {
    public static void main(String[] args) {
        //4 задание
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String city = faker.address().city();
        String company = faker.company().name();
        System.out.println(" Покупатель : " + name);
        System.out.println(" Город " + city);
        System.out.println(" Компания " + company);
        //5 задание
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine().trim();
        String name2 = faker.name().firstName();
        System.out.println("Ваше имя : " + name);
        System.out.println(" победитель :" + name2);
        if (name.equalsIgnoreCase(name2)) {
            System.out.println("Поздравляем вы выиграли ! ");
        } else {
            System.out.println("Вы не выиграли ");
        }
        scanner.close();
    }
}
