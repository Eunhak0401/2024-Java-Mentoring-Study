import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("시험 점수를 입력하시오:");
        int num = scanner.nextInt();

        if (num >= 90) {
            System.out.println("A");
        } else if (num >= 80) {
            System.out.println("B");
        } else if (num >= 70) {
            System.out.println("C");
        } else if (num >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
