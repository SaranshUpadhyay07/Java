public class Section_7_5_Inheritance {
    public static void main(String[] args) {
        Section_7_5_Animal animal = new Section_7_5_Animal("Generic", "Huge", 400);
        doAnimal(animal,"Slow");

        Section_7_5_Dog dog = new Section_7_5_Dog();
        doAnimal(dog,"Fast");

        Section_7_5_Dog yorkie = new Section_7_5_Dog("Yorkie", 15);
        doAnimal(yorkie, "Fast");
        Section_7_5_Dog retriever = new Section_7_5_Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimal(retriever, "Slow");
    }
    public static void doAnimal(Section_7_5_Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
