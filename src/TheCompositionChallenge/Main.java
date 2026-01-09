package TheCompositionChallenge;

public class Main {
    public Main(){

        SmartKitchen smartKitchen = new SmartKitchen();


        smartKitchen.setKitchenState(true, false, true);
        smartKitchen.doKitchenWork();

//        smartKitchen.getBrewMaster().brewCoffee();
//        smartKitchen.getDishWasher().doDishes();
//        smartKitchen.getIceBox().orderFood();

    }

    public static void main(String[] args) {
        new Main();
    }
}
