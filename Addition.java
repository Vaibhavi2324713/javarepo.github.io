public class Addition{
   
    int num1, num2; // Instance variables to store the two numbers

    // Parameterized Constructor to initialize the numbers
    Addition(int a, int b) {
        num1 = a; 
        num2 = b; 
    }

    // Method to add the two numbers
    void addNumbers() {
        int sum = num1 + num2; 
        System.out.println("Sum = " + sum); 
    }

    // Main method: program execution starts here
    public static void main(String[] args) {
        Addition obj = new Addition(10, 20); 

        obj.addNumbers(); 
    }

}
