// Parent class
class Shape {
    // Method to calculate area (generic)
    void area() {
        System.out.println("Area of shape");
    }
}

// Child class Circle overriding area()
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Child class Rectangle overriding area()
class Rectangle extends Shape {
    double length, width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Main class to test the program
public class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle(6);
        Rectangle r = new Rectangle(4, 6);

        c.area();  // Output: Area of Circle
        r.area();  // Output: Area of Rectangle
    }
}

