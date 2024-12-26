package Challenge;

public class Challenge9 {
    public static void main(String[] args){
        int sum =0;
        int counter = 0;
        for(int i =1;i<= 1000; i++)
        {
            if(i%15==0)
            {
                sum+=i;
                counter++;
                System.out.println("Found a number: "+i);
            }
            if(counter ==5)
            {
                break;
            }
        }
        System.out.println("The sum of the numbers is "+sum);
    }
}
