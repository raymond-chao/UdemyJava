package BillsBurgerChallenge;

public class Main {
    public Main(){
//        Burger burger = new Burger("Regular", 4.00);
//        burger.addTopping("BACON", "CHEESE", "AVOCADO");
//        burger.printItem();
//        MealOrder mealorder = new MealOrder();
//        mealorder.addToppings("CHEESE", "AVOCADO", "BACON");
//        mealorder.setDrinksize("LARGE");
//        mealorder.printItemizedList();

        MealOrder deluxeMeal = new  MealOrder("Deluxe", "7UP", "fries" );
        deluxeMeal.addToppings("AVOCADO", "BACON", "CHEESE", "LETTUCE", "MAYO");
        deluxeMeal.setDrinksize("SMALL");
        deluxeMeal.printItemizedList();


    }

    public static void main(String[] args) {
        new Main();
    }
}
