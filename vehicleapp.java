import java.util.Scanner;

abstract class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    abstract void showDetails();
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    void showDetails() {
        System.out.println("Car: " + brand + ", Speed: " + speed + " km/h, Doors: " + doors);
    }
}

class Bike extends Vehicle {
    boolean hasCarrier;

    Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    void showDetails() {
        System.out.println("Bike: " + brand + ", Speed: " + speed + " km/h, Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

class MessageHelper {
    void showMessage(String msg) {
        System.out.println(msg);
    }

    void showMessage(String msg, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }
}

public class vehicleapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Car Brand: ");
        String carBrand = scanner.nextLine();
        System.out.print("Enter Car Speed: ");
        int carSpeed = scanner.nextInt();
        System.out.print("Enter Number of Doors: ");
        int carDoors = scanner.nextInt();
        scanner.nextLine();

        Car car = new Car(carBrand, carSpeed, carDoors);

        System.out.print("Enter Bike Brand: ");
        String bikeBrand = scanner.nextLine();
        System.out.print("Enter Bike Speed: ");
        int bikeSpeed = scanner.nextInt();
        System.out.print("Does the bike have a carrier? (true/false): ");
        boolean hasCarrier = scanner.nextBoolean();
        scanner.nextLine();

        Bike bike = new Bike(bikeBrand, bikeSpeed, hasCarrier);

        car.showDetails();
        bike.showDetails();

        MessageHelper helper = new MessageHelper();
        helper.showMessage("Welcome to Vehicle System");
        helper.showMessage("This is an overloaded message", 2);

        scanner.close();
    }
}
