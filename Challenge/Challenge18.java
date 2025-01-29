package Challenge;

public class Challenge18 {
    public static void main(String[] args) {
        Printer P1 = new Printer(56, false);
        System.out.println("The toner level now: "+P1.addToner(30));
        int pages = P1.PagesPrinted(12);
        System.out.println("The pages printed are: "+pages);
    }
}
