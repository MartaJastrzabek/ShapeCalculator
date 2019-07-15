public class ShapeCalculator {

    double squareArea(Square square){
        double area = square.a * square.a;
        return area;
    }

    double circleArea(Circle circle){
        double area = 3.14 *(circle.r * circle.r);
        return area;
    }

    double trianglePerimeter(Triangle triangle){
        double perimeter = triangle.a + triangle.b + triangle.c;
        return perimeter;
    }

    double rectPerimeter(Rectangle rectangle){
        double perimeter = (2 * rectangle.a) + (2 * rectangle.b);
        return perimeter;
    }


}
