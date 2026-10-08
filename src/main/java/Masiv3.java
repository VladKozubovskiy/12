public class Masiv3 {
    public static void main(String[] args) {
        String[] days = new String[7];
        days[0] = "понедельник";
        days[1] = "вторник";
        days[2] = "среда";
        days[3] = "четверг";
        days[4] = "пятница";
        days[5] = "суббота";
        days[6] = "воскресенье";
        for (String day: days){
            System.out.println(day.toUpperCase());
        }
    }
}
