public class section5_5_methodOverloading {
    public static void main(String[] args) {

        int newScore = calculateScore("Saransh", 500);
        System.out.println("New Score is "+ newScore);

        calculateScore(75);
        calculateScore();
    }
    public static int calculateScore(String player, int score){
        System.out.println(player + " scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score*1000;
    }
    public static int calculateScore(){
        System.out.println("No player scored 0 points");
        return 0;
    }
}
