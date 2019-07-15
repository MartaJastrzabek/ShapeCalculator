public class ShapeCalculatorTest {

    public static void main(String[] args) {

        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(5, 6);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(2, 4, 6);


        double sqArea = square.CalculateArea();
        System.out.println("Square area : "  + sqArea);

        double circleArea  = circle.CalcArea();
        System.out.println("Circle area: " + circleArea);

        double trianglePerimeter = triangle.calcPerimeter();
        System.out.println("Triangle perimeter: " + trianglePerimeter);

        double rectranglePerimeter = rectangle.calcPerimeter();
        System.out.println("Rectangle perimeter: " + rectranglePerimeter);


    }
}
