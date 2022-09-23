

public class Movie {

    private String movieName;
    private String movieLang;
    private String movieGenre;
    private String movieTime;
    private String moviePGRating; 

    public Movie(String name, String language, String genre, String time, String PGRating) {
        this.movieName = name;
        this.movieLang = language;
        this.movieGenre = genre;
        this.movieTime = time;
        this.moviePGRating = PGRating;
    }
    
    public void printMovieDetails() {
        System.out.printf("|%-20s|%-10s|%-10s|%-10s|%-10s|\n", movieName, movieLang, movieGenre, movieTime, moviePGRating);
    }

    public void movieTableHeader() {
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("|%-3s|%-20s|%-10s|%-10s|%-10s|%-10s|\n", 
                 "No.", "Movie Name", "Language", "Genre", "Show Time", "PG Rating");
        System.out.println("|--------------------------------------------------------------------|");
    }
}
