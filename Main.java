abstract class Order {
    abstract void placeOrder();
}

class ElectronicsOrder extends Order {
    void placeOrder() {
        System.out.println("Order placed for Electronics.");
    }
}

class ClothingOrder extends Order {
    void placeOrder() {
        System.out.println("Order placed for Clothing.");
    }
}

public class Main {
    public static void main(String[] args) {
        Order o = new ElectronicsOrder();
        o.placeOrder();

        o = new ClothingOrder();
        o.placeOrder();
    }
}
