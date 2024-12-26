package Challenge;

public class Challenge11 {
    public static void main(String[] args) {
    System.out.println("The sum of the number 1234 is "+sumDigits(1234));
    }
    public static int sumDigits(int n){
        int sum = 0;
        int digit;
        if(n >=0 ) {
            do {
                digit = n % 10;
                n = n / 10;
                sum = sum + digit;
            } while (n > 0);
            return sum;
        }
        return -1;
    }
}
