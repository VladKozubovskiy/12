import java.util.Arrays;

public class Masiv2 {
    public static void main(String[] args) {
        //7 задание (выводит на печать вместо 10 и 50 +1)
        int[] numbers = {1, 2, 3, 4, 5};
        numbers[0] = 10;
        numbers[4] = 50;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 1;
        }
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);
        System.out.println(Arrays.toString(numbers));
    }
}