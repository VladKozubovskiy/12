import java.util.Arrays;

public class Masiv {
    public static void main(String[] args) {
        int[] homme = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < homme.length; i++) {
            homme[i] = homme[i] * 2;
        }
        System.out.println(Arrays.toString(homme));
    }
}
