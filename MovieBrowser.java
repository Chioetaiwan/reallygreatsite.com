import java.util.ArrayList;
import java.util.List;

public class MovieBrowser {
    private List<Movie> movies;

    public MovieBrowser() {
        movies = new ArrayList<>();
        addSampleMovies();
    }

    private void addSampleMovies() {
        movies.add(new Movie(
            "The Matrix", 
            "Sci-Fi", 
            2023,
            "https://images.pexels.com/photos/8386434/pexels-photo-8386434.jpeg"
        ));
        movies.add(new Movie(
            "Inception", 
            "Action", 
            2023,
            "https://images.pexels.com/photos/2774556/pexels-photo-2774556.jpeg"
        ));
    }

    public List<Movie> getAllMovies() {
        return movies;
    }

    public static void main(String[] args) {
        MovieBrowser browser = new MovieBrowser();
        System.out.println("Available Movies:");
        for (Movie movie : browser.getAllMovies()) {
            System.out.println(movie.getTitle() + " (" + movie.getYear() + ")");
        }
    }
}