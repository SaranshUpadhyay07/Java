public class Section_7_5_Fish extends Section_7_5_Animal {
    private int gills;
    private int fins;

    public Section_7_5_Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }
    private void moveMuscles(){
        System.out.print("muscles moving ");
    }
    private void moveBackFin(){
        System.out.print("backFin moving ");
    }

    public void move(String speed){
        super.move(speed);
        moveMuscles();
        if(speed == "Fast"){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Section_7_5_Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
