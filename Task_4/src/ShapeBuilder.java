import java.util.ArrayList;

//  4.3
public class ShapeBuilder {
    ArrayList<Shape> shapesList = new ArrayList<>();

    public ShapeBuilder() {

    }
    public void addShape(Shape s) {
        shapesList.add(s);
    }
    public double getTotalArea() {
        double sum = 0.0;
        for (Shape s : shapesList) {
                sum += s.getArea();
        }
        return sum;

//        double sum = 0.0;
//        for (int i = 0; i < shapesList.size(); i++) {
//            sum += shapesList.get(i).getArea();
//        }
//        return sum;

    }
}