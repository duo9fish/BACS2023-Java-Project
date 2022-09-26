import java.util.*;


public class TestTheatre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create theatre objects
        Theatre[] halls = {
            new Theatre(1),
            new Theatre(2),
            new Theatre(3),
            new Theatre(4),
            new Theatre(5),
            new Theatre(6),
            new Theatre(7),
        };

        halls[6].displaySeats();

    }
}
