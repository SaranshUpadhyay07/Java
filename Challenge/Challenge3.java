package Challenge;

public class Challenge3 {
    public static void main(String[] args) {
        int score = calculateHighScorePosition(1500);
        ranking("Saransh Upadhyay" , score);

        score = calculateHighScorePosition(1000);
        ranking("Soumyadip" , score);

        score = calculateHighScorePosition(500);
        ranking("Tilak" , score);

        score = calculateHighScorePosition(100);
        ranking("Subham" , score);

        score = calculateHighScorePosition(25);
        ranking("Sarthak" , score);
    }

    public static void ranking(String name, int rank) {
        System.out.println(name + " managed to get into position " + rank + " of the score list");
    }

    public static int calculateHighScorePosition(int score){
        int result =0;
        if(score >= 1000){
            result = 1;
        }
        else if((score >= 500)){
            result = 2;
        }
        else if((score >= 100)){
            result = 3;
        }
        else {
            result = 4;
        }
        return result;
    }
}