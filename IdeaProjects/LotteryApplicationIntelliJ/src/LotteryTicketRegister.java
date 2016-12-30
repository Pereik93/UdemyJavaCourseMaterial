import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by perol on 03.06.2016.
 */
public class LotteryTicketRegister implements Iterable<LotteryTicket>  {

    private ArrayList<LotteryTicket> ticketReg;
    private Random randomGenerator;
    /**
     * Creates a new instance of the ticket register
     */
    public LotteryTicketRegister()
    {
        this.ticketReg = new ArrayList<>();
    }

    // adds a ticket to the ticket registry.
    public boolean addTicket(LotteryTicket ticket)
    {
        this.ticketReg.add(ticket);
        return true;
    }

    public void addLotteryicketSeries(int amount) throws MyCheckedException{
        for(int i=0; i <= amount; i++){
            LotteryTicket temp = new LotteryTicket();
            ticketReg.add(temp);
        }
    }

    @Override
    public Iterator<LotteryTicket> iterator()
    {
        return this.ticketReg.iterator();
    }

    // Returns the nmber of tickets in the register
    // @return the number of tickets in the register
    public int getNumberOfTickets()
    {
        return this.ticketReg.size();
    }

    public void printTickets() {
        System.out.println("Ticket List");
        for (int i = 0; i < this.ticketReg.size(); i++) {
            System.out.println((i + 1) + ". Ticket Color: " +
                    this.ticketReg.get(i).getTicketColor() + " Nr:" +
                    this.ticketReg.get(i).getTicketNumber() + " " +
                    this.ticketReg.get(i).getTicketCharacter());
        }
    }

    /**
     * Search the ticket register for a ticket where the color of the ticket matches
     * all or parts of the provided parameter. If no ticket matches the
     * color, <code>null</code> is returned.
     *
     * @param color the title to match
     * @return a LotteryTicket-instance matching the description. If no tickets
     * matches the description, null is returned.
     */
    public LotteryTicket findLotteryTicketByColor(String color)
    {
        boolean found = false;
        LotteryTicket foundTicket = null;

        Iterator<LotteryTicket> it = this.ticketReg.iterator();
        while (it.hasNext() && !found)
        {
            LotteryTicket tmpTicket = it.next();
            if (tmpTicket.getTicketColor().contains(color))
            {
                found = true;
                foundTicket = tmpTicket;
            }
        }
        return foundTicket;
    }

/*
Found some sample code at src="http://stackoverflow.com/questions/5034370/retrieving-a-random-item-from-arraylist"
which i modified for that task given.
 */
    // Draws a random ticket stored in the arrayList and prints it out to system.
    // Removes the drawn ticket.
    public LotteryTicket drawTicket(){
        int index = randomGenerator.nextInt(ticketReg.size());
        LotteryTicket lotteryTicket = ticketReg.get(index);
        System.out.println("Drawing ticket...\n" + lotteryTicket + " was drawn!");
        ticketReg.remove(index);
        System.out.println(index + " was removed from the list");
        return lotteryTicket;
    }

    // showing all tickets not drawn.
    // Drawn tickets get removed from the array.
    public void doShowTicketsNotDrawn(){
        for (int i = 0; i < ticketReg.size(); ++i){
            System.out.println(ticketReg.get(i));
        }
    }
}
