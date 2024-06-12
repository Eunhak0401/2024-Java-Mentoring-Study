package src.src.vendingMachine;
import java.util.Scanner;

public class VendingMachine {
    private Scanner scanner;
    private Beverage[] beverages;

    public VendingMachine() {
        scanner = new Scanner(System.in);
        beverages = new Beverage[]{
                new Beverage("콜라", 1500),
                new Beverage("사이다", 1200),
                new Beverage("물", 1000)
        };
    }

    public void start() {
        while (true) {
            displayMenu();
            int choice = getChoice();

            if (choice == 4) {
                System.out.println("자판기를 종료합니다.");
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                continue;
            }

            Beverage selectedBeverage = beverages[choice - 1];
            System.out.println(selectedBeverage.getName() + "를 선택하셨습니다.");
            processPayment(selectedBeverage);
        }
    }

    private void displayMenu() {
        System.out.println("자판기 메뉴:");
        for (int i = 0; i < beverages.length; i++) {
            System.out.println((i + 1) + ". " + beverages[i].getName() + " - " + beverages[i].getPrice() + "원");
        }
        System.out.println("4. 종료");
    }

    private int getChoice() {
        System.out.print("메뉴를 선택하세요: ");
        return scanner.nextInt();
    }

    private void processPayment(Beverage beverage) {
        System.out.print("돈을 입력하세요: ");
        int money = scanner.nextInt();

        if (money < beverage.getPrice()) {
            System.out.println("돈이 부족합니다. 다시 시도해주세요.");
        } else {
            int change = money - beverage.getPrice();
            System.out.println("거스름돈은 " + change + "원 입니다.");
        }
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.start();
    }
}

