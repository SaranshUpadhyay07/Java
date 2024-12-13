// method overload
package Challenge;

public class Challenge4 {
    public static void main(String[] args) {
        System.out.println("The value in centimeters is "+ toCenti(6,11));
        System.out.println("The value in centimeters is "+ toCenti(12));

    }
    public static double toCenti(int feet, int inches){
        feet *= 12;
        double value = (double)(feet+inches)*2.54; // you could also do this by calling the inches function in the return
        return value;
    }
    public static double toCenti(int feet){
        double value = feet*30.48;
        return value;
    }
}
