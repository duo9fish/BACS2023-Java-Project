
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket {  // remove extend 
    public Ticket() {
    }

    public void printTicket(int totalCustomer, int hallNumber, Theatre theatre, String movieName) {
        SimpleDateFormat formattor = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        for (int i = 0; i < totalCustomer; i++) {
            System.out.println("=================================================");
            System.out.println("TICKET");
            System.out.println("");
            System.out.println("Hall: " + hallNumber);
            System.out.println("Seat: " + (theatre.takenSeats.get(i)).getSeatNumber());
            System.out.println("Movie: " + movieName);
            // System.out.print("Price: RM " + adultPrice); // only this left
            System.out.println(formattor.format(date));
            System.out.println("=================================================\n");
        }
    }
}

