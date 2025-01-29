public class Section_8_2_Encapsulation {
    public static void main(String[] args) {
//        Player p1 = new Player();
//        p1.health=20;
//        p1.fullname="John";
//        p1.weapon="Sword";
//
//        p1.loseHealth(88);

        Player p2 = new Player("Tim");
        System.out.println("The Initial health is "+p2.healthRemaining());

        Player p3 = new Player("Tim", 25,"Katana");
        System.out.println("The Initial health is "+p3.healthRemaining());

        Player p4 = new Player("Tim", 1000, "Sword");
        System.out.println("The Initial health is "+p4.healthRemaining());

        Player p5 = new Player("Tim", -5, "Spear");
        System.out.println("The Initial health is "+p5.healthRemaining());
    }
}
