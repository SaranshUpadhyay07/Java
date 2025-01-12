public class Section_7_5_Dog extends Section_7_5_Animal{
    private String earShape;
    private String tailShape;
    public Section_7_5_Dog(){
        super("Mutt", "Big",50);
    }
    public Section_7_5_Dog(String type, double weight){
        this(type,weight, "Perky","Curled");
    }

    public Section_7_5_Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight< 15? "small":(weight<35? "medium": "large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Section_7_5_Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
    public void makeNoise(){

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs can walk and run and also wag their tail");
    }
}
