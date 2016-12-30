import java.text.DecimalFormat;

/**
 * Created by perol on 03.06.2016.
 */
public class LotteryTicket {

        // Variable initialization
        // Private to support encapsulation
        private final String ticketColor;
        private final char ticketCharacter;
        private final int ticketNumber;


        // Creating a constructor
        public LotteryTicket(String ticketColor, char ticketCharacter, int ticketNumber) throws MyCheckedException {
            this.ticketColor = ticketColor;
            this.ticketCharacter = ticketCharacter;
            // modulo to restrict value from 01-99
            if(ticketNumber >= 100){
                throw new MyCheckedException("The ticket number value must be between 1-99");
            }


            this.ticketNumber = ticketNumber % 99;
        }

        // Default constructor. Gives default values should all fields be empty.
        public LotteryTicket() throws MyCheckedException {
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
            return ticketNumber;
        }

    /**
     * Returns a string representing the Ticket.
     *
     * @return a string representing the Ticket.
     */
    public String getAsString() {
        String result = this.getTicketColor()
                + " Number: " + this.getTicketNumber()
                + " " + getTicketCharacter();

        return result;
    }

}

