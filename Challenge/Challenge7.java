package Challenge;

public class Challenge7 {
    public static void main(String[] args){
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);

    }
    public static void printDayOfWeek(int day){
        switch(day){
            case 0 -> System.out.println(day +" is Sunday");
            case 1 -> System.out.println(day +" is Monday");
            case 2 -> System.out.println(day +" is Tuesday");
            case 3 -> System.out.println(day +" is Wednesday");
            case 4 -> System.out.println(day + " is Thursday");
            case 5 -> System.out.println(day +" is Friday");
            case 6 -> System.out.println(day +" is Saturday");
            default -> {yield: System.out.println("Invalid Day");}
        }
    }
    public static void printWeekDay(int day){
        if (day == 0)
        {
            System.out.println(day +" is Sunday");
        }
        else if (day == 1)
        {
            System.out.println(day +" is Monday");
        }
        else if (day == 2)
        {
            System.out.println(day +" is Tuesday");
        }
        else if (day == 3)
        {
            System.out.println(day +" is Wednesday");
        }
        else if (day == 4)
        {
            System.out.println(day +" is Thursday");
        }
        else if (day == 5)
        {
            System.out.println(day +" is Friday");
        }
        else if (day == 6)
        {
            System.out.println(day +" is Saturday");
        }
        else
        {
            System.out.println(day +" is Invalid Day");
        }
    }
}
