package week3;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("연도를 입력하시오:");
        int num = scanner.nextInt();

        if (num % 4 == 0 || num % 100 != 0 && num % 400 == 0){
            System.out.println("1");
        }else {
            System.out.println("0");
        }


    }
}
