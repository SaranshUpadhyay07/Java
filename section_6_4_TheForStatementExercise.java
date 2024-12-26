public class section_6_4_TheForStatementExercise {
    //prime number
    public static void main(String[] args)
    {
        System.out.println("0 is "+ (isPrime(0)? "" : "Not ")+ "a prime number");
        System.out.println("1 is "+ (isPrime(1)? "" : "Not ")+ "a prime number");
        System.out.println("2 is "+ (isPrime(2)? "" : "Not ")+ "a prime number");
        System.out.println("3 is "+ (isPrime(3)? "" : "Not ")+ "a prime number");
        System.out.println("4 is "+ (isPrime(4)? "" : "Not ")+ "a prime number");
        System.out.println("5 is "+ (isPrime(5)? "" : "Not ")+ "a prime number");
        System.out.println("8 is "+ (isPrime(8)? "" : "Not ")+ "a prime number");
        System.out.println("17 is "+ (isPrime(17)? "" : "Not ")+ "a prime number");
    }
    public static boolean isPrime(int wholeNumber)
    {
        if(wholeNumber<=2){
            return (wholeNumber==2);
        }

        for(int divisor =2; divisor <= wholeNumber/2; divisor++){
            if(wholeNumber%divisor ==0) {
                return false;
            }
        }
        return true;
    }
}
