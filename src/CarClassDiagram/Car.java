package CarClassDiagram;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }
    public void startEngine(){
        System.out.println("Starting engine ...");
    }
    public void drive(){
        System.out.println("Driving ... type is: " + getClass().getSimpleName());
        runEngine();
    }
    protected void runEngine(){
        System.out.println("Engine running ...");
    }
}
class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders = 6;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine() {
        System.out.printf("Gas, all %d cylinders powered up and ready %n" , cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas, usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
}
class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Car on, battery on %d %n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Battery usage is lower than usual %.1f %n", avgKmPerCharge);
    }
}
class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description,  double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas, all %d cylinders powered up ad ready %n" , cylinders);
        System.out.printf("Car on, battery on %d %n", batterySize);
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas, usage exceeds the average: %.2f %n", avgKmPerLitre);

    }
}

