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
        boolean isCar = false;// isCar sirf likhne se inside the if condition is also okk/ !isCar se vo not equal check karega
        if(isCar == true) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
    boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

    if(isDomestic){
        System.out.println("This car is Domestic");
    }

    int ClientAge =35;
    String ageText = ClientAge >= 18 ? "Over eighteen" : "Still kid";
    System.out.println("Our client is " + ageText);

    }
}
