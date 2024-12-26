package Challenge;

public class Challenge10 {
    public static void main(String [] args){
        int i = 5;
        int evencounter =0;
        int oddcounter=0;
        while(i <= 50){
            if(isEvenNumber(i)){
                System.out.println("Even number found: "+i);
                evencounter++;
            }
            if(!isEvenNumber(i)){
                oddcounter ++;
            }
            if (evencounter==5){
                break;
            }
            i++;
        }
        System.out.println("The number of even number is "+evencounter);
        System.out.println("The number of odd number is "+oddcounter);
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
