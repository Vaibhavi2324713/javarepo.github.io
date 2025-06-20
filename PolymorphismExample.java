//polymorphism example
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
// Make sure there is no other 'Cat' class defined elsewhere in your project.
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Upcasting
        Animal myCat = new Cat(); // Upcasting

        myDog.sound(); // Calls Dog's sound method
        myCat.sound(); // Calls Cat's sound method

        // Demonstrating polymorphism with an array of Animals
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.sound(); // Calls the appropriate sound method based on the actual object type
        }
    }
}
