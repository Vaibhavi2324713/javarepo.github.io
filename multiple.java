// Interface one
interface One {
    void eat();  // abstract method
}

// Interface two
interface Two {
    void bark();  // abstract method
}

// Interface three extends both interfaces (Multiple Inheritance of interfaces)
interface Three extends One, Two {
    void meow();  // abstract method
}

// Class implementing interfaces
class ChildClass implements One, Two {
    public void eat() {
        System.out.println("ChildClass is eating");
    }

    public void bark() {
        System.out.println("ChildClass is barking");
    }
}

// Main class to run the program
public class multiple {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.eat();
        obj.bark();
    }
}
