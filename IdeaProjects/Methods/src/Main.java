/**
 * Created by perol on 31.05.2016.
 */
public class Main {

    public static void main(String[] args) {

        int highscore = calculateScore(true, 800, 5, 100);
        System.out.println("Your score was: " + highscore);


        highscore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your score was: " + highscore);


        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Fred", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Gary", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Ginny", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Julia", position);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String pName, int position) {

        String finalString = pName + " managed to get into position "
                + position + " on the high score table";
        System.out.println(finalString);

    }

    public static int calculateHighScorePosition(int pScore) {
        if (pScore >= 1000) {
            //System.out.println("Score is above 1000: " + pScore);
            return 1;
        } else if (pScore >= 500 && pScore < 1000) {
            //System.out.println("Score is above 500 and below 1000. Score: " + pScore);
            return 2;
        } else if (pScore >= 100 && pScore < 500) {
            //System.out.println("Score is above 100 and below 500. Score: " + pScore);
            return 3;
        }

        return 4;
    }

}
