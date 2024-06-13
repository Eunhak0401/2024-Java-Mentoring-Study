package src.src.shape;

public class Main {
    public static void main(String[] args) {
        Shape point = new Point(1, 2);
        Shape circle = new Circle(3, 4, 5);
        Shape rectangle = new Rectangle(5, 6, 7, 8);

        printShapeDetails(point);
        printShapeDetails(circle);
        printShapeDetails(rectangle);
    }

    public static void printShapeDetails(Shape shape) {
        System.out.println(shape);
        System.out.println("영역: " + shape.getArea());
        System.out.println("둘레: " + shape.getPerimeter());
        System.out.println();
    }
}
