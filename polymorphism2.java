class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound();  // Calling the parent class method using super
        System.out.println("Dog barks");
    }
}

public class polymorphism2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();   // Calls Dog's sound() which also calls Animal's sound() using super
    }
}