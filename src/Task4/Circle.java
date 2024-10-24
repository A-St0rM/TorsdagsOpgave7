package Task4;

public class Circle implements Shape {

    double area;


    public Circle(double area){
        this.area = area;
    }

    public double getArea(){
        double result = 0;

        result = 3.14 * (area * area);

        return result;
    }
}
