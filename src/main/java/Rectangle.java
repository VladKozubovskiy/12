public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            System.out.println("Длинна и ширина должна быть больше нуля ");
            this.length = 1.0;
            this.width = 1.0;
        } else {
            this.length = length;
            this.width = width;
        }
    }

    public double calculatorAra() {
        return length * width;
    }

    public double calculatorAsa() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle myRect = new Rectangle(5.0, 2.0);
        System.out.println("Длина: " + myRect.length);
        System.out.println("Ширина: " + myRect.width);
        System.out.println("Площадь: " + myRect.calculatorAra());
        System.out.println("Периметр: " + myRect.calculatorAsa());
    }
}