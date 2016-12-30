
import java.util.Random;
import java.util.Scanner;

/**
 * This is just a DUMMY-class implementing the POSApplication interface.
 * To be replaced with a "proper" class.
 *
 * @author asty
 */
public class LotteryApplicationImpl implements LotteryApplication
{
    private LotteryTicketRegister lotteryTicketRegister;
    Random r = new Random();

    @Override
    public void init()
    {
        this.lotteryTicketRegister = new LotteryTicketRegister();
        this.fillLotteryTicketRegister();
    }

    @Override
    public void doSetupLottery()
    {
        System.out.print("Please provide a color to search for: ");
        Scanner reader = new Scanner(System.in);
        String color = reader.nextLine();

        LotteryTicket lotteryTicket = this.lotteryTicketRegister.findLotteryTicketByColor(color);
        if (null != lotteryTicket)
        {
            System.out.println("Found the following color:");
            System.out.println(lotteryTicket.getAsString());
        } else
        {
            System.out.println("No item found that matches the title: " + color);
        }
    }

    @Override
    public void doDrawLotteryTicket()
    {
        int ticketsDrawn = 0;
        System.out.println("doDrawLotteryTicket() was called in class " + this.getClass());
        for(int i = 0; i <= lotteryTicketRegister.getNumberOfTickets(); i++){
            // using the drawTicket method in LotteryTicketRegister to draw random ticket.
           lotteryTicketRegister.drawTicket();
           ticketsDrawn++;
           System.out.println("Amount of tickets drawn: " + ticketsDrawn);

       }
    }

    @Override
    public void doShowStatus()
    {
        System.out.println("doShowStatus() was called in class " + this.getClass());
    }

    @Override
    public void doShowTicketsNotDrawn()
    {
        System.out.println("doShowTicketsNotDrawn() was called in class " + this.getClass());
    }

    private void fillLotteryTicketRegister()
    {
        LotteryTicket t = new LotteryTicket("Yellow", 'A', 1);
        this.lotteryTicketRegister.addTicket(t);
        LotteryTicket t2 = new LotteryTicket("Yellow", 'A', 2);
        this.lotteryTicketRegister.addTicket(t);
        LotteryTicket t3 = new LotteryTicket("Yellow", 'A', 3);
        this.lotteryTicketRegister.addTicket(t);

    }

}
