public class DeclareVariables {
    static String customerName = "Sasha";
    static int cupsOfCoffee = 1;
    static double costOfCoffee = 99.9;
    static boolean tip = true;

    public static String declareVariables() {
        String response = "";
        response = "Dear " + customerName + ", thank you for supporting our business!"
                + "Cups of coffee bought: " + cupsOfCoffee + ".Cost of 1 cup of coffee: $"
                + costOfCoffee + ".Your total is: $99.9.Tip is included? " + tip + ".";
        return response;
    }
        public static void main (String[] args){
            System.out.println(declareVariables());


        }
    public class Main {
        public static void main(String[] args)
        {
            System.out.println("Hello, world!");
        }
    }
}
