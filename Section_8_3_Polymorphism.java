import java.util.*;

public class Section_8_3_Polymorphism {
    public static void main(String[] args) {

//        Movie theMovie = Movie.getMovie("Adventure","Jumanji");
//        theMovie.watchMovie();

      Scanner s = new Scanner(System.in);

      while(true) {
          System.out.print("Enter type of Movie: A/C/S and Q for Quiting: ");
          String type = s.nextLine();
          if("Qq".contains(type)) {
              System.out.println("Thank you for using our program");
              break;
          }
          System.out.println("Enter title");
          String title = s.nextLine();
          Movie theMovie = Movie.getMovie(type, title);
          theMovie.watchMovie();
      }
    }
}
