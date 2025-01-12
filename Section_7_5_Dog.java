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
        if(type == "Wolf"){
            System.out.print("Ow Wooooo! ");
        }
        else{
        bark();}
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs can walk and run and also wag their tail");
        if(speed == "Slow"){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        System.out.println();
    }
    private void bark(){
        System.out.print("Woof ");
    }
    private void run(){
        System.out.print("Dog running ");
    }
    private void walk(){
        System.out.print("Dog walking ");
    }
    private void wagTail(){
        System.out.print("Dog wagging tail ");
    }
}
