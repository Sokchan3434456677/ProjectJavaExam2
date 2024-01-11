class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }
}
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 6);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Square square = new Square(3);
        System.out.println("Square: " + square.getArea());
    }
}