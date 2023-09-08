package Exceptions;

public class TicketdoesntExist extends RuntimeException{
    public TicketdoesntExist(String message)
    {
        super(message);
    }

}
