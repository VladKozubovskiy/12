public class proba8 {
    public static void main(String[] args) {
        int ase = 1;
        String rury = switch (ase) {
            case 1 -> "Бургер -26р";
            case 2 -> "Кактошка фри -10р";
            case 3 -> "Пицца - 28р";
            default -> "Отуствует в меню";
        };
        System.out.println(rury);
    }
}
