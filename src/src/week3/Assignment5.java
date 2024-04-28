package week3;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 주사위 슷자를 입력하시오:");
        int num = scanner.nextInt();

        System.out.println("두 번째 주사위 슷자를 입력하시오:");
        int num1 = scanner.nextInt();

        System.out.println("세 번째 주사위 슷자를 입력하시오:");
        int num2 = scanner.nextInt();

        if (num == num1 && num == num2){
            System.out.println(10000 + (num) * 1000);
        }if (num == num1 || num == num2 || num1 == num2){
            System.out.println(1000 + (num) * 100);
        }if (num != num1 || num != num2 || num1 != num2){
            System.out.println(100 * (num));
        }
    }
}
