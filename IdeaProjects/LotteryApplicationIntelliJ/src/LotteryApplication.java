
/**
 * A Lottery system. This interface defines the functionality required
 * from the lottery system. It is expected that a class implementing
 * this interface, implements all the methods defined in this interface.
 * 
 * <p>This interface and the class that implements it, it to be considered as
 * part of the <b>user interface</b>. Hence it is natural and accepted to have code
 * that interacts with the user in the class implementing this interface.
 *
 * @author asty
 */
public interface LotteryApplication
{

    /**
     * Initialize the POS-application.
     */
    void init();

    /**
     * Sets up the lottery. The user is asked for the number of prices to
     * be drawn (and hence the number of tickets to draw), and to add
     * the tickets to be drawn to the Lottery Ticket register.
     */
    void doSetupLottery();

    /**
     * Draw one <b><i>random</i></b> ticket and present it to the user. 
     * If the lottery has not been setup yet, the user is
     * notified with a proper message, and asked to setup the lottery before
     * drawing tickets.
     * If all the prices have been drawn, or if there are no tickets left to 
     * draw, the user is notified.
     * When the last ticket has been drawn, a report is printed, listing all 
     * the drawn tickets in the order they were drawn.
     */
    void doDrawLotteryTicket();

    /**
     * Shows the current status of the lottery. The number of tickets in total,
     * the number of drawn tickets, and a list of the drawn tickets in the 
     * order they were drawn, with the last drawn ticket shown at the top
     * of the list.
     */
    void doShowStatus();

    /**
     * List all tickets that have not yet been drawn in the lottery.
     * The list is printed to the consol in the order they appear in the list.
     */
    void doShowTicketsNotDrawn();

}
