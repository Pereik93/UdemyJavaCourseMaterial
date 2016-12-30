/**
 * Created by perol on 31.05.2016.
 */
public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score == 5000) {
//            System.out.println("Your score was 5000");
//        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your score was: " + finalScore);
        }

        if (gameOver){
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int secondFinalScore = score + (levelCompleted * bonus);
            System.out.println("Your second score was: " + secondFinalScore);

        }

        System.out.println("Score: " + score);
        System.out.println("levelCompleted: " + levelCompleted);
        System.out.println("bonus: " + bonus);


    }
}
