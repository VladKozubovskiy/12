import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 задание
        //System.out.println(" Введите имя ");
        //String name = scanner.nextLine();
        //System.out.println(" привет " + name);

        //2 задание
        //System.out.println("Введите ваш возраст");
        //int age = scanner.nextInt();
        //int nextAge = age + 1;
        //System.out.println(" Через год вам будет "+ nextAge + " лет");

        //3 задание
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int sum = a + b;
        int raz = a - b;
        int pro = a * b;
        System.out.println(" Сумма " + sum);
        System.out.println(" Разность " + raz);
        System.out.println(" Произведение "+ pro);
        scanner.close();
    }
}
