// If then else challenge

package Challenge;

public class Challenge2 {
    public static void main(String[] args) {
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        boolean gameOver = true;
        int final_score = score;

        if (gameOver) {
            final_score += (levelCompleted * bonus);
            System.out.println("Your Final score is " + final_score);
        }
    }
// ismein kya hua ki upar wali approach mein maine new variable sbnae hai jiski wajah se memory use hogi
// althogh maine  yha nye variable nahi bnaya lekin bde code mein dikkat hoskti hai kyunki memmoey use hoti hai.
// to basically purane bne hue variable vo you can reassign values
// Memory kam use hua hai which is advantage  but disadvantage is that original record is no longer maintained
// Dusra disadvantage is that ki hum duplicate kar rhe hai code ko to har jagah change karna pdega if a change s made
}
