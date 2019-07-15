public class ShapeCalculatorTest {

    public static void main(String[] args) {

        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(5, 6);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(2, 4, 6);

        ShapeCalculator calc = new ShapeCalculator();

        double sqArea = calc.squareArea(square);
        System.out.println("Square area : "  + sqArea);

        double circleArea  = calc.circleArea(circle);
        System.out.println("Circle area: " + circleArea);

        double trianglePerimeter = calc.trianglePerimeter(triangle);
        System.out.println("Triangle perimeter: " + trianglePerimeter);

        double rectranglePerimeter = calc.rectPerimeter(rectangle);
        System.out.println("Rectangle perimeter: " + rectranglePerimeter);


    }
}
