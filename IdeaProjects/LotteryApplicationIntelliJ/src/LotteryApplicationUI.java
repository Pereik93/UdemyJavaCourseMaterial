
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Makes up the user interface (text based) of the Lottery-application.
 * Responsible for all main user interaction, like displaying the menu and
 * receiving input from the user.
 *
 * The LotteryApplicationUI works together with the LotteryApplication class.
 *
 * @author asty
 */
class LotteryApplicationUI
{

    /**
     * Variable holding the LotteryApplication object.
     */
    private LotteryApplication lotteryApplication = null;

    /**
     * Creates an instance of the POSApplicationUI User interface. An instance
     * of the POSApplication is created, and initialized.
     */
    public LotteryApplicationUI()
    {
        //TODO: Replace "new LotteryApplicationImpl" with your application class.
        this.lotteryApplication = new LotteryApplicationImpl();
    }

    /**
     * Starts the application by showing the main menu and retrieving
     * input from the user.
     */
    void start()
    {
        this.lotteryApplication.init();

        boolean quit = false;

        while (!quit)
        {
            try
            {
                int menuSelection = this.showMainMenu();
                switch (menuSelection)
                {
                    case 1:
                        this.lotteryApplication.doSetupLottery();
                        break;

                    case 2:
                        this.lotteryApplication.doDrawLotteryTicket();
                        break;

                    case 3:
                        this.lotteryApplication.doShowStatus();
                        break;

                    case 4:
                        this.lotteryApplication.doShowTicketsNotDrawn();
                        break;

                    case 5:
                        System.out.println("\nThank you for using the Lottery Application v0.1. Bye!\n");
                        quit = true;
                        break;

                    default:
                }
            } catch (InputMismatchException ime)
            {
                System.out.println("\nERROR: Please provide a number between 1 and 4..\n");
            }
        }

    }

    /**
     * Displays the main menu to the user, and waits for the users input.
     * The user is expected to input an integer between 1 and 5. If the user
     * inputs anything else, an InputMismatchException is thrown.
     * The method returns the valid input from the user.
     *
     * @return the menu number (between 1 and 5) provided by the user.
     * @throws InputMismatchException thrown if wrong menu selection
     */
    private int showMainMenu() throws InputMismatchException
    {
        int numberOfMenuItems = 5;
        
        System.out.println("\n**** Lottery v0.1 ****\n");
        System.out.println("1. Setup Lottery");
        System.out.println("2. Draw a lottery ticket");
        System.out.println("3. Show result");
        System.out.println("4. Show tickets not drawn");
        System.out.println("5. Exit\n");
        System.out.println("Please choose menu item (1-" 
                + numberOfMenuItems + "): ");

        Scanner reader = new Scanner(System.in);
        int menuSelection = reader.nextInt();
        if ((1 > menuSelection) || (numberOfMenuItems < menuSelection))
        {
            throw new InputMismatchException();
        }
        return menuSelection;
    }

}
