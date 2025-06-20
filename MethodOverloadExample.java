//method overloading example
class MathOperations {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
}
public class MethodOverloadExample {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Calling the method to add two integers
        System.out.println("Sum of 5 and 10: " + math.add(5, 10));

        // Calling the method to add three integers
        System.out.println("Sum of 5, 10, and 15: " + math.add(5, 10, 15));

        // Calling the method to add two doubles
        System.out.println("Sum of 5.5 and 10.5: " + math.add(5.5, 10.5));
    }
}