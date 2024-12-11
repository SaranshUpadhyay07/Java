public class section5_3_CodeBlocks_and_If_Then_Else_control_statement {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000){
            System.out.println("Your score is less then 5000");
        } else {
            System.out.println("Got here");
        }
    }
}
