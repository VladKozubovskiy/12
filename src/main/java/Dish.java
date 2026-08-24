public class Dish {
    static void main(String[] args) {
        String name = "Alex";
        int ocb1 = 3;
        double ocb2 = 25.5;
        double ocb3 = 76.5;
        boolean ocb4 = false;
        char ocb5 = '$';
        System.out.println(name.toLowerCase());
        System.out.println("Dear " + name + ", thank you for visiting our restaurant!");
        System.out.println("Dishes ordered: " + ocb1);
        System.out.println("Cost of 1 dish: " + ocb5 + ocb2);
        System.out.println("Delivery included? "  + ocb4);
        System.out.println("Your total is: " + ocb5 +ocb3);
    }
}
