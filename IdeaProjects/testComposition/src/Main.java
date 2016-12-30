/**
 * Created by perol on 02.06.2016.
 */
public class Main {

    public static void main(String[] args){
        Chair theChair = new Chair(4, false);
        Couch theCouch = new Couch(12, true);
        Room theRoom = new Room(theChair, theCouch);
        theRoom.decorate();
    }
}
