package src.week7;

public class OverloadingMethods {
    public void print() {
        System.out.println("매개변수X - 오버로딩1");
    }

    String print(Integer a) {
        System.out.println("Integer - 오버로딩2");
        return a.toString();
    }

    void print(String a) {
        System.out.println("String - 오버로딩3");
        System.out.println(a);
    }

    String print(Integer a, Integer b) {
        System.out.println("Integer, Integer - 오버로딩4");
        return a.toString() + b.toString();
    }

}

class OverloadingTest {

    public static void main(String[] args) {
        OverloadingMethods om = new OverloadingMethods();

        om.print();
        System.out.println(om.print(3));
        om.print("Hello!");
        System.out.println(om.print(4, 5));
    }
}
