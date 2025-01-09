public class Section_7_1_2 {
    public static void main(String[] args) {

        Section_7_1_Introduction_to_Classes_and_Objects car = new Section_7_1_Introduction_to_Classes_and_Objects();
        car.describeCar();
        car.setMake("Porsche");
        car.setColor("Olive");
        car.setDoors(2);
        car.setConvertible(false);
        car.setModel("911 GT 3 RS");
        System.out.println("Make = "+ car.getMake());
        System.out.println("Model = "+ car.getModel());
        System.out.println("Color = "+ car.getColor());
        System.out.println("Doors = "+ car.getDoors());
        System.out.println("Convertible = "+ car.isConvertible());
    }
}
