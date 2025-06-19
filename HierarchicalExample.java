//hierarchical inheritance example
// Parent Class (Superclass)
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child Class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child Class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Main Class to Run the Code
public class HierarchicalExample {
    public static void main(String[] args) {
        Dog dogObj = new Dog();
        dogObj.eat();   // Inherited from Animal
        dogObj.bark();  // Own method of Dog

        System.out.println();

        Cat catObj = new Cat();
        catObj.eat();   // Inherited from Animal
        catObj.meow();  // Own method of Cat
}
}