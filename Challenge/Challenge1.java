package Challenge;

public class Challenge1 {
    public static void main(String[] args) {
        double a = 20.00;
        double b = 80.00;
        double c = (a+b) * 100.00;
        double d = c % 40.00;
        boolean Check = (d == 0.00) ? true : false;
        System.out.println(Check);
        if (Check==false) {
            System.out.println("Got some remainder");
        }
        else
        {
            System.out.println("No remainder");
        }

    }
}
