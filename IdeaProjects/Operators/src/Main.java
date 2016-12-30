/**
 * Created by perol on 31.05.2016.
 */
public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now: " + result);
        result++;
        System.out.println("Result is now: " + result);
        result--;
        System.out.println("Result is now: " + result);

        result += 2;
        System.out.println("Result is now: " + result);
        result *= 10;
        System.out.println("Result is now: " + result);
        result -= 10;
        System.out.println("Result is now: " + result);
        result /= 10;
        System.out.println("Result is now:" + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        } else if (isAlien == true) {
            System.out.println("It is an alien");
        }

        int topScore = 80;
        int secondTopScore = 60;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        if ((topScore > secondTopScore) && (topScore < 90)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("One of these tests are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This worked.");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is a car");
            System.out.println(isCar);
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("wasCar is true");
        }

        // TASK ::::::
        double x = 20d;
        double y = 80d;

        double myTotal = (x+y) * 25;

        double remainder = myTotal%40;

        if (remainder <= 20){
            System.out.println("Result is = " + remainder + ", which is less than or equal to 20");
        }

    }


}
