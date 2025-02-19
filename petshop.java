import java.util.Scanner;

interface Animal {
    void makeSound();

    default void eat() {
        System.out.println("This animal is eating.");
    }

    static void animalInfo() {
        System.out.println("Animals have different sounds and habits.");
    }
}

interface Pet {
    void showAffection();
}

class Dog implements Animal, Pet {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Bow Bow!");
    }

    @Override
    public void showAffection() {
        System.out.println(name + " shakes its tail happily.");
    }
}

public class petshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Dog's Name: ");
        String dogName = scanner.nextLine();

        Dog myDog = new Dog(dogName);

        myDog.makeSound();
        myDog.showAffection();
        myDog.eat();

        Animal.animalInfo();

        scanner.close();
    }
}
