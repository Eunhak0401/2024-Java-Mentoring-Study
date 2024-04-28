package week3;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.println("X좌표를 입력하시오:");
        int num = scanner.nextInt();
        System.out.println("Y좌표를 입력하시오:");
        int num1 = scanner.nextInt();

        if (num > 0 && num1 > 0){
            System.out.println("1사분면");
        }else if (num > 0 && num1 < 0) {
            System.out.println("2사분면");
        }else if (num < 0 && num1 < 0) {
            System.out.println("3사분면");
        }else if (num > 0 && num1 < 0 ) {
            System.out.println("4사분면");
        }
    }
}
