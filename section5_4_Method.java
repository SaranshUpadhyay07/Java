public class section5_4_Method {
    public static void main(String[] args) {

        int highScore = calculateScore(800, 5, 100, true);
        System.out.println("The high score is "+highScore);

        System.out.println("The next high score is " +
        calculateScore(10000, 8,  200, true));
    }

    public static int calculateScore(int score, int levelCompleted, int bonus, boolean gameOver) {

        int final_score = score;

        if (gameOver) {
            final_score += (levelCompleted * bonus);
            final_score += 1000;

        }

        return final_score;
    }
}
