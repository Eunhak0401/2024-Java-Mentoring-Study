package src.src.Movie;
import java.util.ArrayList;
import java.util.List;

public class Theater {
    private List<Movie> movies;

    public Theater() {
        movies = new ArrayList<>();
        movies.add(new Movie("영화 A", 10));
        movies.add(new Movie("영화 B", 5));
        movies.add(new Movie("영화 C", 2));
    }

    public void displayMovies() {
        System.out.println("영화 목록:");
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println((i + 1) + ". " + movie.getTitle() + " - 남은 좌석: " + movie.getAvailableSeats());
        }
    }

    public Movie getMovie(int index) {
        if (index >= 0 && index < movies.size()) {
            return movies.get(index);
        }
        return null;
    }
}
