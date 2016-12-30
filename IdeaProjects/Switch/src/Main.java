/**
 * Created by perol on 01.06.2016.
 */
public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was neither 1 or 2.");
        }

        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Value was neither 1, 2, 3, 4 or 5.");
                break;
        }

        char letter = 'A';
        switch (letter) {
            case 'A':
                System.out.println("Letter was A");
                break;
            case 'B':
                System.out.println("Letter was B");
                break;
            case 'C':
                System.out.println("Letter was C");
                break;
            case 'D':
                System.out.println("Letter was D");
                break;
            case 'E':
                System.out.println("Letter was E");
                break;
            default:
                System.out.println("Letter was neither A, B, C, D or E");
                break;
        }

        String month = "JaNuary";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Month is January");
                break;
            case "february":
                System.out.println("Month is February");
                break;
            default:
                System.out.println("Month not found");
                break;
        }

    }
}
