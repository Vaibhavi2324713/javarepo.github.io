// Parent class
class Animal {
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
    
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child class
class Cat extends Animal {
    void meow() {
        System.out.println("Cat says Meow Meow...");
    }
}

// Main class
public class singleinhertance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sleep();  // Method from parent class Animal
        c.eat();    // Method from parent class Animal
        c.meow();   // Method from child class Cat
    }
}
