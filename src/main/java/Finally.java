import java.util.NoSuchElementException;
import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ведите имя пользоваттеля ");
            String name = scanner.nextLine();
            System.out.println("Привет " + name);
        } catch (NoSuchElementException | IllegalStateException e) {
            System.out.println("Произошла ошибка при чтении данных " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("Ресукрсы освобождены ");
        }
    }
}
