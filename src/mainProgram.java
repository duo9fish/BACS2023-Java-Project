import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {

    //// --MOVIES MODULE--////
        Movie movie = new Movie();
        Movie movies[] = {
                new Movie("Star Wars", "English", "Sci-Fi", "3:00PM", "13+"),
                new Movie("Your Name", "Japanese", "Fiction", "5:00PM", "13+"),
                new Movie("Deadpool", "English", "Comics", "5:00PM", "18+"),
                new Movie("Among Us", "English", "Sci-Fi", "8:00PM", "13+"),
                new Movie("Imposter", "English", "History", "9:00PM", "18+")
        };

        // Display Header and Available Movies
        System.out.printf("\nWelcome to XXXX Movie Ticketing System" +
                "\n======================================\n");
        System.out.println("\nAvailable Movies for today: ");
        movie.movieTableHeader();
        for (int i = 0; i < 5; i++) {
            System.out.printf("|%-3d", i + 1);
            movies[i].printMovieDetails();
        }
        printLine();

        // Input movie Number
        int movieChose = movie.inputValidation(movies);

        // Display movie Chosen
        System.out.println("\nMovie Chosen: ");
        movie.movieTableHeader();
        System.out.printf("|%-3d", movieChose);
        movies[movieChose - 1].printMovieDetails();
        printLine();
    //// --------------------////

    //// --TICKETING MODULE--////
        Customer customers = new Customer();
        int totalQuantity,
            adultQuantity,
            childQuantity,
            studentQuantity;
        // Input Total Quantity of Ticket
        do {
            totalQuantity = customers.inputValidation(); // input and validation

            // Input Quantity of Adult tickets
            Adult adult = new Adult();
            adultQuantity = adult.input(totalQuantity);
            totalQuantity -= adultQuantity;

            customers.ticketsLeft(totalQuantity); // Print total tickets (specified by user prior) left

            // Input Quantity of Children tickets
            Children children = new Children();
            childQuantity = children.input(totalQuantity);
            totalQuantity -= childQuantity;

            customers.ticketsLeft(totalQuantity); // Print total tickets (specified by user prior) left

            // Input Quantity of Student tickets
            Student student = new Student();
            studentQuantity = student.input(totalQuantity);
            totalQuantity -= studentQuantity;

            if (totalQuantity != 0) {
                System.out.println("Total ticket count does not match with total quantity of tickets needed, Please try again!");
            }
        } while (totalQuantity != 0);

        // to pass value into customer class and those sub-classes for claculations
        // purpose
        Customer adultTickets = new Adult(adultQuantity, childQuantity, studentQuantity);
        Customer childTickets = new Children(adultQuantity, childQuantity, studentQuantity);
        Customer studentTickets = new Student(adultQuantity, childQuantity, studentQuantity);

        // to check the display value whether works or not.
        // //PLACEHOLDER//PLACEHOLDER//PLACEHOLDER//PLACEHOLDER//PLACEHOLDER//PLACEHOLDER//PLACEHOLDER//PLACEHOLDER
        System.out.println(adultTickets.toString());
        System.out.println(childTickets.toString());
        System.out.println(studentTickets.toString());
        // PLACEHOLDER//PLACEHOLDER//PLACEHOLDER//delete later//
    //// --------------------////
    }

    public static void printLine() {
        System.out.println("----------------------------------------------------------------------");
    }
}