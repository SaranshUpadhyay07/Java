public class section_6_3_TheForStatement {
    public static void main (String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }
        for (double i = 2.0; i <= 5.0; i++) {
            System.out.println("10000 at "+i+" interest = " + calcualteInterest(10000, i));
        }
        for (double i = 7.5; i <= 10.0; i+=0.25) {
            if(calcualteInterest(100, i)>8.5){
                break;
            }
            System.out.println("$100 at "+i+" interest = $" + calcualteInterest(100, i));
        }
    }

    public static double calcualteInterest(double amount, double interest){
        return amount * (interest/100);
    }
}
