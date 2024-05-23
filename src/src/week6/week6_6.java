package src.src.week6;

import java.util.Scanner;

class C {
    private int n;
    private int m;

    public C() {
            try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("n부터 m까지의 합: ");
            this.n = scanner.nextInt();
            System.out.print("n부터 m까지의 합: ");
            this.m = scanner.nextInt();
        }
}
    public int sumRange() {
        int sum = 0;
        for (int i = n; i <= m; i++) {
            sum += i;
        }
        return sum;
    }
}
        public class week6_6 {
            public static void main(String[] args) {

        C instance = new C();

        int sum = instance.sumRange();
        System.out.println(sum);
    }
}
