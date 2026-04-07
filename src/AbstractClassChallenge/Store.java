package AbstractClassChallenge;

import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductsForSale> storeProducts = new ArrayList<>();

    record OrderItem(int quantity, ProductsForSale product) {}

    public Store(){
        storeProducts.add(new ArtObject("Oil painting", 13500,
                "Work by ABC painted in 2010"));
        storeProducts.add(new ArtObject("Sculpture", 20000,
                        "Work by Deez, produced in 1950"));


        storeProducts.add(new Furniture("Desk", 5000,
                "DPJ Desk"));
        storeProducts.add(new Furniture("Lamp", 2000,
            "Ikea lamp"));

        listProducts();
        System.out.println("\n Order 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\n Order 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 2, 1);
        printOrder(order2);


    }
    public static void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(20));
            item.showDetails();
        }
    }

    public void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity){
        order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));

    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales total = %6.2f kr %n", salesTotal);
    }


    static void main() {
        new Store();
    }
}
