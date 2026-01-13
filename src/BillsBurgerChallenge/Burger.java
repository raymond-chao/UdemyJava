package BillsBurgerChallenge;

public class Burger extends Item {
        protected Item item1;
        protected Item item2;
        protected Item item3;

        public Burger(String name, double price){
            super("Burger",name, price);
        }

        @Override
        public String getName() {
            return super.getName() + "BURGER";
        }

        @Override
        public double getAdjustedPrice() {
            return super.getBasePrice() +
                    ((item1 == null) ? 0 : item1.getAdjustedPrice()) +
                    ((item2 == null) ? 0 : item2.getAdjustedPrice()) +
                    ((item3 == null) ? 0 : item3.getAdjustedPrice());
        }
        public double getExtraPrice(String toppingName){
            return switch (toppingName.toUpperCase()) {
                case "CHEESE", "AVOCADO" -> 1.0;
                case "BACON" -> 0.5;
                default -> 0.0;
            };
        }

        public void addTopping(String item1, String item2, String item3){
            this.item1 = new Item("TOPPING", item1,
                    getExtraPrice(item1));
            this.item2 = new Item("TOPPING", item1,
                    getExtraPrice(item2));
            this.item3 = new Item("TOPPING", item2,
                    getExtraPrice(item3));
        }
        public void printItemizedList(){
            printItem("BASE BURGER", getBasePrice());
            if (item1 != null) {
                item1.printItem();
            }
            if (item2 != null) {
                item2.printItem();
            }
            if (item3 != null) {
                item3.printItem();
            }
        }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(20));
        super.printItem();
    }
}
