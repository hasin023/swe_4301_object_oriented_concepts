public class BusTicketGenerator implements ITicketGenerator {
    @Override
    public ITicket generateTicket(Traveller traveller) {
        return new BusTicket(traveller);
    }
}
