class Calculator {
    
    // Method to perform addition
    int add(int a, int b) {
        return a + b;
    }

    // Method to perform subtraction
    int subtract(int a, int b) {
        return a - b;
    }

    // Method to perform multiplication
    int multiply(int a, int b) {
        return a * b;
    }

    // Method to perform division
    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return (double) a / b;
    }

    // Main method
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int num1 = 24;
        int num2 = 6;

        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));
    }
}
