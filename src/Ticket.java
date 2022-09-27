
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket {  // remove extend 
    private String movieName;

    public Ticket(String movieName) {
        this.movieName = movieName;
    }

    public Ticket() {
    }

    public void printTicket(int adultQty, double adultPrice) {
        SimpleDateFormat formattor = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        Theatre ticket = new Theatre();
        for (int i = 0; i < 5; i++) {
            System.out.println("=================================================\n");
            System.out.print("Seat: " + ticket.takenSeats.get(i));
            System.out.print("Movie: " + movieName); //changed to movieName
            System.out.print("Price: RM " + adultPrice);  // changed to proper variable name
            System.out.print(formattor.format(date));
            System.out.println("=================================================\n");
        }
    }
}
