package src.src.Movie;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Movie> bookedMovies;

    public Customer(String name) {
        this.name = name;
        bookedMovies = new ArrayList<>();
    }

    public void bookMovie(Movie movie) {
        if (movie.bookSeat()) {
            bookedMovies.add(movie);
            System.out.println(movie.getTitle() + " 예매 완료");
        } else {
            System.out.println(movie.getTitle() + " 좌석이 매진되었습니다.");
        }
    }

    public void cancelMovie(Movie movie) {
        if (bookedMovies.remove(movie)) {
            movie.cancelSeat();
            System.out.println(movie.getTitle() + " 예매 취소 완료");
        } else {
            System.out.println(movie.getTitle() + " 예매 내역이 없습니다.");
        }
    }

    public void displayBookedMovies() {
        System.out.println(name + "님의 예매된 영화:");
        for (Movie movie : bookedMovies) {
            System.out.println(movie.getTitle());
        }
    }
}
