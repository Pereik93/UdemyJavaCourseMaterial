/**
 * Created by perol on 31.05.2016.
 */

public class Hello {

    public static String hello = "Hello World!";
    public static String variable = "This is my variable: ";

    public static void main(String[] args){

        System.out.println(hello);

        int myFirstNumber  = (5*3) + (2);
        int mySecondNumber = 12;
        int mtThirdNumber  = Math.round(mySecondNumber / 2);

        int myTotal  = myFirstNumber + mySecondNumber + mtThirdNumber;
        int lastTotal = 1000 - myTotal;

        System.out.println(variable  + myTotal);

        System.out.println(variable  + lastTotal);
    }
}
