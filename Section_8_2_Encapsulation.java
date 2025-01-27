public class Section_8_2_Encapsulation {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.health=20;
        p1.fullname="John";
        p1.weapon="Sword";

        p1.loseHealth(88);
    }
}
