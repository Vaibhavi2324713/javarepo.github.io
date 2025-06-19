// Interface A
interface A {
    void showA();
}

// Interface B extends A
interface B extends A {
    void showB();
}

// Interface C
interface C {
    void showC();
}

// Class D implements B and C (Hybrid Inheritance)
class D implements B, C {
    public void showA() {
        System.out.println("This is showA() from Interface A");
    }

    public void showB() {
        System.out.println("This is showB() from Interface B");
    }

    public void showC() {
        System.out.println("This is showC() from Interface C");
    }
}

// Main Class
public class HybridInheritanceExample {
    public static void main(String[] args) {
        D obj = new D();
        obj.showA(); // From Interface A
        obj.showB(); // From Interface B
        obj.showC(); // From Interface C
}
}