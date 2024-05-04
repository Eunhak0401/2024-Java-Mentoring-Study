package week4;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            for (int i = 0; i <= 10; i++) {
                int num = scanner.nextInt();
                int num1 = scanner.nextInt();
                System.out.println("case#" + i + ":" + (num + num1));
            }
        }
    }
}
