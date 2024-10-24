package Task4;

import java.util.ArrayList;

public class ShapeBuilder {

    ArrayList<Shape> shapes = new ArrayList<>();

    public ArrayList<Shape> addShape(Shape s){
        shapes.add(s);
        return shapes;
    }

    public double getTotalArea(){
        double totalArea = 0.0;
        for (Shape s : shapes) {
            totalArea += s.getArea();
        }
        return totalArea/shapes.size();
    }
}
