package Task4;

public class Main {
    public static void main(String[] args) {

        Shape circle1 = new Circle(2);

        double result = circle1.getArea();
        System.out.println(result);


        Shape square1 = new Square(3);

        double area = square1.getArea();
        System.out.println(area);

        ShapeBuilder shapeBuilder = new ShapeBuilder();

        shapeBuilder.addShape(circle1);
        shapeBuilder.addShape(square1);

        double totalArea = shapeBuilder.getTotalArea();
        System.out.println(totalArea);
    }
}
