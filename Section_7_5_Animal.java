public class Section_7_5_Animal {

    protected String type;
    private String size;
    private double weight;
    public Section_7_5_Animal() {

    }

    public Section_7_5_Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Section_7_5_Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void move(String speed){
        System.out.println(type+" moves "+ speed);
    }
    public void makeNoise(){
        System.out.println(type+" makes some kind of noise");
    }
}
