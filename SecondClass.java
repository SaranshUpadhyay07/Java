public class SecondClass {
    public static void main(String[] args) {
        System.out.println("Hello, Saransh");

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("Not an Alien");
            System.out.println("And i am scared of aliens");
        }
    int topScore = 80;
        if(topScore < 100){
            System.out.println("You got high score!");
        }

        int secondTopScore = 60;// && is And operator

        if((topScore  > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore >90) || (secondTopScore <= 90))
        {
            System.out.println("Either or both of the condition are true");
        }
    }
}
