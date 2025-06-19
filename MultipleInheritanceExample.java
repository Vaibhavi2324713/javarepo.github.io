interface Father {
    void home();
}

// Second interface
interface Mother {
    void car();
}

// Child class implementing both interfaces
class Child implements Father, Mother {
    public void home() {
        System.out.println("Father's home");
    }

    public void car() {
        System.out.println("Mother's car");
    }
}

// Main class
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.home();  // Father's property
        c.car();   // Mother's property
    }
}

