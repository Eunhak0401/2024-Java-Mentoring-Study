package src.week7;

public class Main {
    public static void main(String[] args) {


        Car car = new Car();
        Bike bike = new Bike();

        car.color = "검정색";
        car.model = "아반때";

        System.out.println("나의 자동차는 " + car.model
        + "이며, 색상은 " + car.color + "이다.");

        car.moveForward();
        car.moveBackwrad();
        car.openWindow();

        bike.moveForward();
        bike.moveBackwrad();
        bike.stunt();
    }
}
