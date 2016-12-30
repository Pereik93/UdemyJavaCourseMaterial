/**
 * Created by perol on 02.06.2016.
 */
public class Chair extends Furniture {
    private int legs;
    private boolean isAdjustable;

    public Chair(int legs, boolean isAdjustable) {
        super("Dark Grey", 10, 2);
        this.legs = legs;
        this.isAdjustable = isAdjustable;
    }

    public void placeChair(){
        System.out.println("Chair placed in room.");
        System.out.println("Chair color: " + getColor() + ", weight: " + getWeight() + ".\n");
    }
}
