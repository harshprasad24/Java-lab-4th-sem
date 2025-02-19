import java.util.Scanner;

abstract class Shape {
    abstract void find_Area();
}
class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    void find_Area() {
        System.out.println("Area of Square: " + (side * side));
    }
}

class Rectangle extends Shape {
    private double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void find_Area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        double side = scanner.nextDouble();
        Square square = new Square(side);

        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);

        square.find_Area();
        rectangle.find_Area();

        scanner.close();
    }
}