package week4;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 0;
        int i = 0;

        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println(sum);



    }
}
