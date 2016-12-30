/**
 * Created by perol on 03.06.2016.
 */
public class DrawnLotteryTickets{

    int numberOfDrawnTickets;

    public DrawnLotteryTickets(int numberOfDrawnTickets) {
        this.numberOfDrawnTickets = numberOfDrawnTickets;
    }

    public int getNumberOfDrawnTickets() {
        return numberOfDrawnTickets;
    }


    public String getAsString()
    {
        String result = getAsString()
                + ", Number of tickets drawn: " + this.getNumberOfDrawnTickets();
        return result;
    }


}
