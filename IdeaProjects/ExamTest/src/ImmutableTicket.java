import java.text.DecimalFormat;

/**
 * Created by perol on 03.06.2016.
 */
public final class ImmutableTicket {

    // Variable initialization
    // Private to support encapsulation
    private final String ticketColor;
    private final char ticketCharacter;
    private final int ticketNumber;


    // Creating a constructor
    public ImmutableTicket(String ticketColor, char ticketCharacter, int ticketNumber) {
        this.ticketColor = ticketColor;
        this.ticketCharacter = ticketCharacter;
        // modulo to restrict value from 01-99
        this.ticketNumber = ticketNumber % 99;
    }

    // Default constructor. Gives default values should all fields be empty.
    public ImmutableTicket() {
        this("Yellow", 'A', 1);
    }

    //Accessor methods for the variables
    public String getTicketColor() {
        return ticketColor;
    }

    public char getTicketCharacter() {
        return ticketCharacter;
    }

    public int getTicketNumber() {
            if (ticketNumber < 10) {
                // If number is less than 10, format it to display 2 number. e.g 01,02 etc.
                DecimalFormat formatter = new DecimalFormat("00");
                String aFormatted = formatter.format(ticketNumber);
                System.out.println("Ticket ");
                System.out.println("Ticket number: " + aFormatted);
            }
            System.out.println("Ticket number: " + ticketNumber);
            return ticketNumber;
        }
}
