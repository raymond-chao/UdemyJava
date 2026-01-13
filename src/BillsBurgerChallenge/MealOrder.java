package BillsBurgerChallenge;

import static BillsBurgerChallenge.Item.printItem;

public class MealOrder {
    private Item side;
    private Item drink;
    private Burger burger;

    public MealOrder() {
        this("regular", "coke", "fries");

    }
    public MealOrder(String burgerType, String drinkType, String sideType){
        if (burgerType.equalsIgnoreCase("Deluxe")) {
            this.burger = new DeluxeBurger(burgerType, 5.0);
        } else {
            this.burger = new Burger(burgerType, 4.0);
        }
            this.drink = new Item(drinkType, "drink", 1.0);
            this.side = new Item(sideType, "fries", 2.0);
    }

    public double getTotalprice(){
        if (burger instanceof DeluxeBurger) {
            return burger.getAdjustedPrice();
        }
        return side.getAdjustedPrice() +  drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void addToppings(String item1, String item2, String item3) {
        burger.addTopping(item1, item2, item3);
    }

    public void addToppings(String item1, String item2, String item3, String item4,
                            String item5) {
        if (burger instanceof DeluxeBurger db) {
            db.addTopping(item1, item2, item3, item4, item5);
        } else {
            burger.addTopping(item1, item2, item3);
        }
    }

    public void setDrinksize(String size) {
        drink.setSize(size);

    }

    public void printItemizedList() {
        burger.printItem();
        if (burger instanceof DeluxeBurger) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
            System.out.println("-".repeat(20));
            printItem("TOTAL", getTotalprice());

    }

    public double printTotal() {
        return 0;
    }
}
