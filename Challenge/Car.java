package Challenge;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }
    public void startEngine(){
        System.out.println(description+"type of car starts it's engine");
    }

    public void drive(){
        runEngine();
        System.out.println(description+"type of car is driving");
        System.out.println(getClass().getSimpleName()+" is the class ");
    }

    protected void runEngine(){
        System.out.println("Engine is running");
    }
}

class GasPowerCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;
    private double zeroToSixty;

    public GasPowerCar(String description, double avgKmPerLitre, int cylinders, double zeroToSixty) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.zeroToSixty = zeroToSixty;
    }

    public void startEngine(){
        System.out.println("The Gas powered engine is on");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName()+"  is driving");
        runEngine();
    }

    protected void runEngine(){
        System.out.println("The Gas car covers 0 to 60 kmph in :"+zeroToSixty+"s");
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;
    private double zeroToSixty;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize, double zeroToSixty) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
        this.zeroToSixty = zeroToSixty;
    }

    public void startEngine(){
        System.out.println("The battery powered engine is on");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName()+" is driving");
        runEngine();;
    }

    protected void runEngine(){
        System.out.println("The electric car covers 0 to 60 kmph in :"+zeroToSixty+"s");
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;
    private double zeroToSixty;

    public HybridCar(String description, double avgKmPerLitre, int cylinders, int batterySize, double zeroToSixty) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
        this.zeroToSixty = zeroToSixty;
    }

    public void startEngine(){
        System.out.println("The hybrid engine is on");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName()+" is driving");
        runEngine();
    }

    protected void runEngine(){
        System.out.println("The hybrid car covers 0 to 60 kmph in :"+zeroToSixty+"s");
    }

}