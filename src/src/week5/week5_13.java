package src.src.week5;
// 10818 백준 문제
import java.util.Scanner;

public class week5_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇개의 정수를 입력하시겠습니까? : ");
        int num = scanner.nextInt();

        if (num > 0) {
            int[] array = new int[num];

            System.out.println("정수" + num + "개 입력: ");

            for (int i = 0; i < num; i++) {
                array[i] = scanner.nextInt();
                }

            int min = array[0];
            int max = array[0];

            for (int i = 1; i < num; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
                if (array[i] > max) {
                    max = array[i];
                }
            }

            System.out.println("입력된 정수는 다음과 같습니다: ");
            for (int a : array) {
                System.out.print(a + " ");
            }
            System.out.println();


            System.out.println("최소값: " + min);
            System.out.println("최댓값: " + max);
        }
        scanner.close();
    }
}





