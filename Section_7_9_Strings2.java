import java.util.Scanner;

public class Section_7_9_Strings2 {
    public static void main(String[] args) {
        String str = "07/04/2005";
        int startingIndex = str.indexOf("2005");
        System.out.println("Starting index of birth Year is: "+startingIndex);
        System.out.println("Birth year = "+ str.substring(startingIndex));
        System.out.println("Month: "+str.substring(3,5));

        String newDate = String.join("/", "07", "04", "2005");
        System.out.println("New date = "+newDate);
        String newdate ="25";
        newdate = newdate.concat("/").concat("11").concat("/").concat("2005");
        System.out.println("New date 2 = "+newdate);

        System.out.println(newdate.replace("/", "-"));
    }
}
