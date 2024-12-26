package Challenge;

public class Challenge8 {
    public static void main(String[] args){
        int counter =0;
        for (int i = 55; i<= 1000; i++){

            if (isPrime(i))
            {
                counter++;
                System.out.println(i+ " is prime");
            }

            if(counter == 3){
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n<=2)
        {
            return (n ==2);
        }

        for(int i=2; i<= n/2; i++){
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
