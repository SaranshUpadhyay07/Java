public class Section5_2_KeywordandExpression {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);

        int high_score = 50;

        if(high_score > 25) {
            high_score = 1000 + high_score;
        }
        int health = 100;
        if((health > 50) && (high_score > 100)) {
            high_score = high_score - 1000;
        }
    }
}
