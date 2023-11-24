class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year of Manufacture: " + year);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;
    private int seatingCapacity;

    public Car(String make, String model, int year, int doors, int capacity) {
        super(make, model, year);
        this.numberOfDoors = doors;
        this.seatingCapacity = capacity;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Seating Capacity: " + seatingCapacity + " passengers");
    }
}

class Motorcycle extends Vehicle {
    private int engineCapacity;
    private String type;

    public Motorcycle(String make, String model, int year, int engineCapacity, String type) {
        super(make, model, year);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Type: " + type);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 4, 5);
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022, 1200, "Cruiser");

        System.out.println("Car Details:");
        myCar.displayDetails();

        System.out.println("\nMotorcycle Details:");
        myMotorcycle.displayDetails();
    }
}

