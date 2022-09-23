import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {
        
        //Movies
        Movie movies[] = {
            new Movie("Star Wars", "English", "Sci-Fi", "3:00PM", "13+"),
            new Movie("Your Name", "Japanese", "Fiction", "5:00PM", "13+"),
            new Movie("Deadpool", "English", "Comics", "5:00PM", "18+"),
            new Movie("Among Us", "English", "Sci-Fi", "8:00PM", "13+"),
            new Movie("Imposter", "English", "History", "9:00PM", "18+")
        };

        //Header and Available Movies
        System.out.printf("\nWelcome to XXXX Movie Ticketing System" + 
                          "\n======================================\n");
        System.out.println("\nAvailable Movies for today: \n");
        System.out.printf("|%-3s|%-20s|%-10s|%-10s|%-10s|%-10s|\n", 
                 "No.", "Movie Name", "Language", "Genre", "Show Time", "PG Rating");
        System.out.println("|--------------------------------------------------------------------|");
        for(int i = 0; i<5; i++){
            System.out.printf("|%-3d", i+1);
            movies[i].movieDetails();
        }

        //Input movie Number
        Scanner movieChose = new Scanner(System.in);
        System.out.print("\nChoose your movie: ");
        movieChose.next();
        
        do{
            System.out.println("Input Invalid! Please Enter Numbers (e.g. 1-9) Only!");
            System.out.print("\nChoose your movie: ");
            movieChose.next();
        }while(!movieChose.hasNextInt());

        System.out.println("Movie Chosen: ");
        movies[(int)movieChose-1].movieDetails();;


    }
}