/**
 * Created by perol on 02.06.2016.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.presPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        // Fancy graphics here.
        monitor.drawPixlAt(1200, 50 ,"yellow");
    }

}
