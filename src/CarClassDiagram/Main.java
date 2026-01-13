package CarClassDiagram;

public class Main {
    public Main(){

        GasPoweredCar folovoo = new  GasPoweredCar("2015 Volvo S60", 10,6);
        runRace(folovoo);

        ElectricCar tesla = new  ElectricCar("2025 Tesla", 400,98);
        runRace(tesla);

        HybridCar toyota = new HybridCar("2025 Toyota", 4.5, 52, 3);
        runRace(toyota);

    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }

    public static void main(String[] args) {
        new Main();
    }
}
