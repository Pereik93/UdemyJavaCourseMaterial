/**
 * Created by perol on 02.06.2016.
 */
public class Room {
    private Chair theChair;
    private Couch theCouch;

    public Room(Chair theChair, Couch theCouch) {
        this.theChair = theChair;
        this.theCouch = theCouch;
    }

    public void decorate(){
        theChair.placeChair();
        theCouch.placeCouch();
    }
}
