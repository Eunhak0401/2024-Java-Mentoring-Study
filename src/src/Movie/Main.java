package src.src.Movie;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Theater theater = new Theater();
        Customer customer = new Customer("고객");

        while (true) {
            System.out.println("\n1. 영화 목록 보기\n2. 영화 예매\n3. 예매 취소\n4. 예매된 영화 보기\n5. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    theater.displayMovies();
                    break;
                case 2:
                    theater.displayMovies();
                    System.out.print("예매할 영화 번호를 선택하세요: ");
                    int movieIndex = scanner.nextInt() - 1;
                    Movie movieToBook = theater.getMovie(movieIndex);
                    if (movieToBook != null) {
                        customer.bookMovie(movieToBook);
                    } else {
                        System.out.println("잘못된 선택입니다.");
                    }
                    break;
                case 3:
                    customer.displayBookedMovies();
                    System.out.print("취소할 영화 번호를 선택하세요: ");
                    int cancelIndex = scanner.nextInt() - 1;
                    Movie movieToCancel = theater.getMovie(cancelIndex);
                    if (movieToCancel != null) {
                        customer.cancelMovie(movieToCancel);
                    } else {
                        System.out.println("잘못된 선택입니다.");
                    }
                    break;
                case 4:
                    customer.displayBookedMovies();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
