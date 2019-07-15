public class Rectangle {

    int a;
    int b;

    Rectangle(int num1, int num2){
        a = num1;
        b = num2;
    }

    double calcPerimeter(){
        double perimeter = (2 * a) + (2 * b);
        return perimeter;
    }
}
