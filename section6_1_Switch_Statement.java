public class section6_1_Switch_Statement
{
    public static void main(String[] args)
    {
        int switchValue = 5;

        switch (switchValue)
        {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value is 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2 or 3 or 4 or 5");
        }
    }
}
