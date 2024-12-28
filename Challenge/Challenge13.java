package Challenge;

import java.util.Scanner;

public class Challenge13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;
        int minNumber= Integer.MAX_VALUE;
        do{
            System.out.println("Enter an number: ");
            try{
                String num = sc.nextLine();
                int n = Integer.parseInt(num);
                if(n<minNumber){                  //Line 15 seLine 20 mein help lgi
                    minNumber=n;
                }
                if (n>maxNumber){
                    maxNumber=n;
                }

            }
            catch(NumberFormatException e){
                System.out.println("Exiting");
                break;
            }
        }while(true);

        System.out.println("Max: "+ maxNumber);
        System.out.println("Min: "+ minNumber);
    }
}
