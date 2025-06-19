class Animal { // Grandparent class
    void eat() {
        System.out.println("Animal is eating...");
    }
}
class Mammal extends Animal { // Parent class
    void walk() {
        System.out.println("Mammal is walking...");
    }
}
class Dog extends Mammal { // Child class 
    void bark() {
        System.out.println("Dog is barking...");
    }
}
public class MultilevelInheritance { // Main class to run the program
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // From Animal
        d.walk();  // From Mammal
        d.bark();  // From Dog
    }
}