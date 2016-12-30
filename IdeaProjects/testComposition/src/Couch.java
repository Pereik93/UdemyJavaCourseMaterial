/**
 * Created by perol on 02.06.2016.
 */
public class Couch extends Furniture{
    private int seats;
    private boolean isSleepingCouch;

    public Couch(int seats, boolean isSleepingCouch) {
        super("Black", 40, 10);
        this.seats = seats;
        this.isSleepingCouch = isSleepingCouch;
    }

    public void placeCouch(){
        System.out.println("Couch placed in room.");
        System.out.println("Couch color: " + getColor() + ", weight: " + getWeight() + ".\n");
    }
}
