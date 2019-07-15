public class Circle {
    int r;

    Circle(int radius){
        r = radius;
    }

    double calcArea(){
        double area = 3.14 *(r * r);
        return area;
    }
}
