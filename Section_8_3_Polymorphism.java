public class Section_8_3_Polymorphism {
    public static void main(String[] args) {
        Movie M = new Movie("Cinema");
        M.watchMovie();
        System.out.println("---------------");

        Movie m1 = new Adventure("Jumanji");
        m1.watchMovie();
        System.out.println("---------------");

        Movie m2 = new Comedy("That's my boy");
        m2.watchMovie();
        System.out.println("---------------");

        Movie m3 = new Scifi("Extraterrestrial");
        m3.watchMovie();
    }
}
