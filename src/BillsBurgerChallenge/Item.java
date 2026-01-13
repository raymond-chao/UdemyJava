package BillsBurgerChallenge;

public class Item {
    private String name;
    private String type;
    private double price;
    public String size = "MEDIUM";


    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public String getName() {
        if (type.equals("TOPPING")) {
            return name;
        }
        if (type.equals("SIDE") || type.equals("DRINK")) {
        }
        return size + " " + name;
    }

    public void setSize(String size) {
        this.size = size;

    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);

    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }

}
