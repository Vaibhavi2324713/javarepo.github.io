// Grandparent Class
class Electronics {
    void category() {
        System.out.println("This is an electronic device.");
}
}

// Parent Class
class Computer extends Electronics {
    void type() {
        System.out.println("It is a computer.");
}
}

// Child Class
class Laptop extends Computer {
    void feature() {
        System.out.println("Feature: Portable and lightweight.");
}
}

public class Example3 {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.category(); // From Electronics
        l.type();     // From Computer
        l.feature();  // From Laptop
    }
}