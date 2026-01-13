package BillsBurgerChallenge;

public class DeluxeBurger extends Burger {
    private Item deluxeBurger1;
    private Item deluxeBurger2;

    public DeluxeBurger(String name, double price) {
        super(name, price);
    }
    public String getName(){
        return super.getName() + "Deluxe Burger";
    }
    @Override
    public double getAdjustedPrice() {
        return super.getBasePrice() +
                ((deluxeBurger1 == null) ? 0 : deluxeBurger1.getAdjustedPrice()) +
                ((deluxeBurger2 == null) ? 0 : deluxeBurger2.getAdjustedPrice());
    }

    public void addTopping(String item1, String item2, String item3, String item4, String item5) {
        super.addTopping(item1, item2, item3);
        this.deluxeBurger1 = new Item("TOPPING", item4, 5.0);
        this.deluxeBurger2 = new Item("TOPPING", item5, 5.5);
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }

    public void printItemizedList(){
        printItem("DELUXE BURGER", getBasePrice());
        if (deluxeBurger1 != null) {
            deluxeBurger1.printItem();
        }
        if (deluxeBurger2 != null) {
            deluxeBurger2.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(20));
        super.printItem();

    }
}
