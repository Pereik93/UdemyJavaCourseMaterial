/**
 * Created by perol on 03.06.2016.
 */
public class LotteryTicketTest {

    public testGetTicketColor() {

    }

    public testGetTicketCharacter() {

    }

    public testGetTicketNumber() {
        LotteryTicket ticket = new LotteryTicket("Yellow", 'A', 2  );
        int expectedTicketNumber = 2;
        String expectedTicketColor = "Yellow";
        char expectedTicketChar = 'A';
        assertEquals( expectedTicketNumber, ticket.getTicketNumber());
        assertEquals( expectedTicketColor, ticket.getTicketColor());
        assertEquals( expectedTicketChar, ticket.getTicketCharacter());
    }

    public testGetAsString() {

    }
}
