public class Section_8_1_Product {
    private String model;
    private String manufacturer;
    private int length;
    private int height;
    private int depth;

    public Section_8_1_Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Section_8_1_Product{
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void Color(int x, int y, String color){
        System.out.println(String.format("Drawing the point (%d,%d) in color: %s", x,y,color));
    }
}
class MotherBoard extends Section_8_1_Product{
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Loading program: " + programName);
    }
}
class ComputerCase extends Section_8_1_Product{
    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}

