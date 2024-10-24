package Task4;

public class Square implements Shape{

    double area;


    public Square(double area){
        this.area = area;
    }

    public double getArea(){
        double result;

        result = area * area;

        return result;
    }
}
