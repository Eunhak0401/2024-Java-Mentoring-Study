class Americano {
    String name = "아메리카노";
    int price = 2000;
}

public class ReferenceVariable {

    public static void main(String[] args) {
        Americano americano = new Americano();

        System.out.println(americano.name);
        System.out.println(americano.price);
    }
}