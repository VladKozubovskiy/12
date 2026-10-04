public class Proba13 {
    public static void main(String[] args) {
        int number = 123456;
        int conter = 0;
        while (number != 0) {
            number = number / 10;
            conter++;
        }
        System.out.println(conter);
    }
}