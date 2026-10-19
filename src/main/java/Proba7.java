public class Proba7 {
    public static void main(String[] args) {
        int soly = -100;
        if (soly < 0) {
            System.out.println("Некоректная сумма ");
        }
     else if (soly <= 100) {
            System.out.println("скидка 0%");
        } else if (soly <= 500) {
            System.out.println("скидка 10%");
        } else {
            System.out.println("скидка 20%");
        }
    }
}
