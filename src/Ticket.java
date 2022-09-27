
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
        Theatre theatre = new Theatre();
        for (int i = 0; i < 5; i++) {
            System.out.println("=================================================\n");
            System.out.print("Seat: " + theatre.takenSeats.get(i));
            System.out.print("Movie: " + getMovieName());
            System.out.print("Price: RM " + b);
            System.out.print(formattor.format(date));
            System.out.println("=================================================\n");
        }
    }
}
