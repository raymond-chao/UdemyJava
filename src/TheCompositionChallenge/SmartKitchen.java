package TheCompositionChallenge;

public class SmartKitchen {
    private CoffeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;


    public SmartKitchen() {
        brewMaster = new CoffeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }
    public void setKitchenState(boolean brewFlag, boolean dishFlag, boolean fridgeFlag){
        brewMaster.setHasWorktoDo(brewFlag);
        dishWasher.setHasWorktoDo(dishFlag);
        iceBox.setHasWorktoDo(fridgeFlag);
    }
    public void doKitchenWork(){
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }

    class CoffeMaker {
        private boolean hasWorktoDo;

        public void setHasWorktoDo(boolean hasWorktoDo) {
            this.hasWorktoDo = hasWorktoDo;
        }

        public void brewCoffee() {
            if (hasWorktoDo) {
                System.out.println("Brewing coffee");
                hasWorktoDo = false;
            }
        }
    }

    class Refrigerator {
        private boolean hasWorktoDo;

        public void setHasWorktoDo(boolean hasWorktoDo) {
            this.hasWorktoDo = hasWorktoDo;
        }

        public void orderFood() {
            if (hasWorktoDo) {
                System.out.println("Order food");
                hasWorktoDo = false;
            }
        }

    }

    class DishWasher {
        private boolean hasWorktoDo;

        public void setHasWorktoDo(boolean hasWorktoDo) {
            this.hasWorktoDo = hasWorktoDo;
        }

        public void doDishes() {
            if (hasWorktoDo) {
                System.out.println("Doing the dishes");
                hasWorktoDo = false;
            }
        }
    }
    public CoffeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

}
