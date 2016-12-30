/**
 * Created by perol on 02.06.2016.
 */
public class Audi extends Car {
    private int roadServiceMonths;

    public Audi(int roadServiceMonths) {
        super("4WD", "Audi", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){

        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeCurrentGear(1);
        } else if (newVelocity > 0 && newVelocity <=10){
            changeCurrentGear(1);
        } else if (newVelocity > 10 && newVelocity <=20){
            changeCurrentGear(2);
        } else if (newVelocity > 20 && newVelocity <=30){
            changeCurrentGear(3);
        } else {
            changeCurrentGear(4);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
