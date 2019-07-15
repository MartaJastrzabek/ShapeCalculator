public class Triangle {

    int a;
    int b;
    int c;
    int h;

    Triangle(int num1, int num2, int num3){
        a = num1;
        b = num2;
        c = num3;
    }

    Triangle(int num, int height){
        a = num;
        h = height;
    }

    double calcPerimeter(){
        double perimeter = a + b + c;
        return perimeter;
    }
}
