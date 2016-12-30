/**
 * Created by perol on 03.06.2016.
 */
public class SetupLottery extends LotteryTicketRegister {

    public SetupLottery() {

    }

    public void addLotteryicketSeries(char ticketCharacter, String ticketColor, int amount){
        for (int i = 0; i <= amount; i++){
            addLotteryicketSeries(getTicketCharacter(), getTicketColor(), amount);
            System.out.println("Lottery ticket: " + getTicketNumber() + " registered");
        }
    }
}
