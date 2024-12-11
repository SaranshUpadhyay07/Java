public class section5_4_Method {
    public static void main(String[] args) {

        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        boolean gameOver = true;

        calculateScore(score, levelCompleted, bonus, gameOver);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(score, levelCompleted, bonus, gameOver);
    }

    public static void calculateScore(int score, int levelCompleted, int bonus, boolean gameOver) {

        int final_score = score;

        if (gameOver) {
            final_score += (levelCompleted * bonus);
            final_score += 1000;
            System.out.println("Your Final score is " + final_score);
        }
    }
}
