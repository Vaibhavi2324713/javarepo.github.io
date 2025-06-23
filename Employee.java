class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee information
    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary:" + salary);
        System.out.println("-----------------------");
    }

    // Main method to test Employee class
    public static void main(String[] args) {
        // Creating multiple employee objects
        Employee e1 = new Employee(1, "Vaibhvai", 5006900);
        Employee e2 = new Employee(2, "vedshri", 825000);
        Employee e3 = new Employee(3, "tejaswini", 652000);

        // Display employee information
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}



