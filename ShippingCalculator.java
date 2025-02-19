import java.util.Scanner;

class Box {
    double width, height, depth;
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume() {
        return width * height * depth;
    }
}
class BoxWeight extends Box {
    double weight;
    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }
    double shippingCost(double distance, double costPerKm) {
        return distance * volume() * costPerKm;
    }
}
public class ShippingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter depth: ");
        double depth = scanner.nextDouble();
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter distance:");
        double distance = scanner.nextDouble();
        System.out.print("Enter cost: ");
        double costPerKm = scanner.nextDouble();
        BoxWeight box = new BoxWeight(width, height, depth, weight);
        double boxVolume = box.volume();
        double shippingCost = box.shippingCost(distance, costPerKm);
        System.out.printf("Volume of the box: \n", boxVolume);
        System.out.printf("Cost to ship the box:\n", shippingCost);
        scanner.close();
    }
}