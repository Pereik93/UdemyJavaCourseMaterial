/**
 * Created by perol on 01.06.2016.
 */
public class Main {

    public static void main(String[] args){


//        int count = 6;
//        while( count != 6);{
//            System.out.println("Count value is: " + count);
//            count++;
//        }
//
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//            if(count > 100){
//                break;
//            }
//        } while(count != 6);
////        count = 1;
////        while(true){
////            if (count == 6){
////                break;
////            }
////            System.out.println("Count value is: " + count);
////            count++;
////        }
        int count = 0;
        int number = 5;
        int finishNumber = 20;
        while(number <= finishNumber){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }

            System.out.println(number + " is an even number");
            number++;
            count++;
            if(count >= 5){
                break;
            }
        }
        System.out.println("Total even numbers found: " + count);
    }

    public static boolean isEvenNumber(int number){
        if((number % 2) == 0) {
            //System.out.println(number + " is an even number");
            return true;
        }
        else{
            //System.out.println(number + " is not an even number");
            return false;
        }

    }


}
