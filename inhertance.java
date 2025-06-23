// Parent class
class Vehicle {
    void display() {
        System.out.println("This is a Vehicle.");
    }
}

// Child class 1
class Car extends Vehicle {
    void display() {
        System.out.println("This is a Car.");
    }
}

// Child class 2
class Bike extends Vehicle {
    void display() {
        System.out.println("This is a Bike.");
    }
}

// Main class to run the program
public class inhertance {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();    // Polymorphism in action
        v.display();      // Output: This is a Car.

        v = new Bike();
        v.display();      // Output: This is a Bike.
    }
}
