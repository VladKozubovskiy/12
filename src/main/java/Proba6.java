public class Proba6 {
    public static void main(String[] args) {
        int gura = 120;
        if (gura < 0 || gura > 100) {
            System.out.println("Некоректный балл");
        } else if (gura >= 90) {
            System.out.println("Оценка : A");
        } else if (gura >= 75) {
            System.out.println("Оценка : В");
        } else if (gura >= 60) {
            System.out.println("Оценка : C");
        } else {
            System.out.println("Оценка :F");
        }
    }
}
