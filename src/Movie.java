public class Movie {

    private String movieName;
    private String movieLang;
    private String movieGenre;
    private String movieTime;
    private String moviePGRating; 

    public Movie(String name, String language, String genre, String time, String PGRating) {
        movieName = name;
        movieLang = language;
        movieGenre = genre;
        movieTime = time;
        moviePGRating = PGRating;
    }

    //---GETTERS AND SETTERS
    public String getMovieName() {
        return this.movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieLang() {
        return this.movieLang;
    }

    public void setMovieLang(String movieLang) {
        this.movieLang = movieLang;
    }

    public String getMovieGenre() {
        return this.movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMovieTime() {
        return this.movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }

    public String getMoviePGRating() {
        return this.moviePGRating;
    }

    public void setMoviePGRating(String moviePGRating) {
        this.moviePGRating = moviePGRating;
    }
    //---
    
}
