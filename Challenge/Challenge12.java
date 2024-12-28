package Challenge;
import java.util.Scanner;
public class Challenge12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =1;
        do{

            System.out.println("Enter the number #"+i);
            try{
                String number = sc.nextLine();
                int num = Integer.parseInt(number);
                i++;}
            catch(NumberFormatException e){System.out.println("Kindly Enter a Correct number");}
        }while(i<=5);
        do{
            try{
            String number = System.console().readLine("Enter the number #"+i+" ");
            int num = Integer.parseInt(number);
            i++;}
            catch(NumberFormatException e){System.out.println("Kindly Enter a Correct number");}
        }while(i<11);
    }

}
