public class Proba3 {
    public static void main(String[] args) {
        int count = 0;
        int number = 8;
        if (number % 2 == 0) {
            System.out.println("четное");
            count++;
        } else {
            System.out.println("нечетное");
        }
        System.out.println("Количество четных чисел : " + count);
    }
}
