public class Circle {
    int r;

    Circle(int radius){
        r = radius;
    }

    double CalcArea(){
        double area = 3.14 *(r * r);
        return area;
    }
}
