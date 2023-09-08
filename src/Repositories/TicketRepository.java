package Repositories;

import Exceptions.TicketdoesntExist;
import models.Ticket;

import java.util.HashMap;

public class TicketRepository {
    HashMap<String, Ticket> ticketRepo = new HashMap<>();
    public Ticket get(String ticket)
    {
        if(ticketRepo.containsKey(ticket))
        {
            return ticketRepo.get(ticket);
        }
        else
        {
            throw new TicketdoesntExist("ticket doesnt exits for given id");
        }
    }
    public void remove(String ticket)
    {
        ticketRepo.remove(ticket);
    }
    public void put(Ticket ticket)
    {
        ticketRepo.put(ticket.getTicketId(),ticket);
    }
}
