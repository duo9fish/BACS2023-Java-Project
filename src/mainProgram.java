import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {
        
        //Movies
        Movie[] movies = {
            new Movie("Star Wars", "English", "Sci-Fi", "3:00PM", "13+"),
            new Movie("Your Name", "Japanese", "Fiction", "5:00PM", "13+"),
            new Movie("Deadpool", "English", "Comics", "5:00PM", "18+"),
            new Movie("Among Us", "English", "Sci-Fi", "8:00PM", "13+"),
            new Movie("Imposter", "English", "History", "9:00PM", "18+")
        };

        //Header and Available Movies
        System.out.printf("\nWelcome to TAR Movie Ticketing System" + 
                          "\n======================================\n");
        System.out.println("\nAvailable Movies for today: ");
        movies[0].movieTableHeader();
        for(int i = 0; i<5; i++){
            System.out.printf("|%-3d", i+1);
            movies[i].printMovieDetails();
        }
        System.out.println("----------------------------------------------------------------------");

        //Input movie Number
        Scanner sc = new Scanner(System.in);
        int movieChose;
        do {
            System.out.print("\nChoose your movie: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter NUMBERS ONLY!");
                System.out.print("\nChoose your movie: ");
                sc.next();
            }
            movieChose = sc.nextInt();
            if (movieChose < 1 || movieChose > movies.length) {
                System.out.println("Movie No." + movieChose + " does not exist! Please enter number 1-" + movies.length);
            }
            else {
                break;
            }
        } while(movieChose < 1 || movieChose > movies.length);

        System.out.println("\nMovie Chosen: ");
        movies[0].movieTableHeader();
        System.out.printf("|%-3d", movieChose);
        movies[movieChose-1].printMovieDetails();
        System.out.println("----------------------------------------------------------------------");
    }
}