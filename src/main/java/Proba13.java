public class Proba13 {
    public static void main(String[] args) {
        int number = 123456;
        int counter = 0;
        while (number != 0) {
            number = number / 10;
            counter++;
        }
        System.out.println(counter);
    }
}