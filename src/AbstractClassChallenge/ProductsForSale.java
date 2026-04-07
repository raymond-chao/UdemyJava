package AbstractClassChallenge;

import java.util.HashMap;
import java.util.Map;

public abstract class ProductsForSale {
    Map<String, Integer> products = new HashMap<>();
    String type;
    double price;
    String des;

    public ProductsForSale(String type, int price, String des) {
        this.type = type;
        this.price = price;
        this.des = des;

    }

    public double getSalesPrice(int quantity) {
        return quantity * price;

}
    public void printPricedItem(int quantity){
//        printad i 2 decimaler %2d
//        decimaltal, double eller float kommer att printad med 2 decimaler
//        med total bredd 8


        System.out.printf("%2d quantity at %8.2f kr each, %-15s %-35s %n", quantity, price, type, des);

    }

    public abstract void showDetails();
}