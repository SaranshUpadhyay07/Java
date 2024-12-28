import java.util.Scanner;

public class section_6_7_takingInput {
    public static void main(String[] args) {
        int currentyear = 2024;

//        try {
//                System.out.println(getInputFromConsole(currentyear));
//        }catch (NullPointerException e){
            System.out.println( getInputFromScanner(currentyear));
    }
    public static String getInputFromConsole(int currentyear){
        String name = System.console().readLine("Hi What is your name ? ");
        String year = System.console().readLine("Enter your birth year: ");

        int age = currentyear - Integer.parseInt(year);
        return name +", so you are "+ age+" years old";
    }
    public static String getInputFromScanner(int currentyear){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, What's your name ? ");
        String name =scanner.nextLine();
        int age =0;
        do{System.out.println("what year were you born in: ");
            try{
                String year = scanner.nextLine();
                age = currentyear - Integer.parseInt(year);}
            catch(NumberFormatException e){
                System.out.println("Character not allowed!! Try Again...");
            }
        }while(age>125|| age<0);
        return name + ", so you are " + age+ " years old";
    }
}
