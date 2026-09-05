public class Sentyab {
    public static void main(String[] args) {
        int speed;
        String driverName;
        speed = 60;
        driverName = "Иван";
        System.out.println(speed);
        System.out.println(driverName);

        //1.Обьявление
        //2.Инициализация
        //3.Обьявление и инициализация
        //4.Переприсваивание
        int score;
        score = 10;
        int bonus = 5;
        score = score + bonus;
        System.out.println(score);

        String favoriteBook;
        favoriteBook = "Ход королевы";
        System.out.println(favoriteBook.length());

        String secretCode = null;
        System.out.println(secretCode);
        // Выведется на экран null

        String str = "Java";
        str.toUpperCase();
        System.out.println(str);

        //ошибка в том что int может быть только целое число
        //вместо true написать false
        int asw = 15;
        int aws = 4;
        System.out.println(asw % aws);

        int b = 0;
        b = 5 / 2;
        System.out.print(b);
    }
    }




