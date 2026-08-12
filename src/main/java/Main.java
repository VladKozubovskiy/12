public class Main {
    static String customerName = "Sasha";
    static int cups0fCoffee = 1;
    static double cost0fCoffee = 99.9;
    static boolean tip = true;
    static char usd = '$';

    public static void main(String[] args) {
        System.out.println("Dear " + customerName + ",thank you for supporting our business!");
        System.out.println("Cups of coffee bought: " + cups0fCoffee);
        System.out.println("Cost of 1 cup of coffee: " + usd + cost0fCoffee);
        System.out.println("Your total is:" + " " + usd + cost0fCoffee);
        System.out.println("Tip is included? " + tip);
    }
}
