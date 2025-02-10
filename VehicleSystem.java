class Vehicle {
    private String model;
    private int year;
    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
class Car extends Vehicle {
    private int numDoors;
    private String fuelType;
    public Car(String model, int year, int numDoors, String fuelType) {
        super(model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }
    public int getNumDoors() {
        return numDoors;
    }
    public String getFuelType() {
        return fuelType;
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Car car = new Car("Toyota Corolla", 2022, 4, "Gasoline");
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Number of Doors: " + car.getNumDoors());
        System.out.println("Fuel Type: " + car.getFuelType());
    }
}