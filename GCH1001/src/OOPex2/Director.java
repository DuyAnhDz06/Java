
import java.util.ArrayList;

public class Director {

    private int id;
    private String name;
    private String phone;

    ArrayList<Movie> movies;
    ArrayList<String> genres;

    public Director(int id, String name) {
        this.id = id;
        this.name = name;
        movies = new ArrayList<Movie>();
        genres = new ArrayList<String>();
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    //////////////////////////////
    public String getName() {
        return name;
    }
}
