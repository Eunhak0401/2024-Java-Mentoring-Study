import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;

        System.out.println("A를 입력하시오:");
        int num = scanner.nextInt();
        System.out.println("B를 입력하시오:");
        int num1 = scanner.nextInt();

        if (num > num1) {
            System.out.println(">");
        }
        if (num < num1) {
            System.out.println("<");
        }
        if (num == num1) {
            System.out.println("==");
        }
    }
}
