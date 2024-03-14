import java.util.ArrayList;

//  4.3
public class BootyBuilder {
    ArrayList<Shape> shapesList = new ArrayList<>();

    public BootyBuilder() {

    }

    public void addShape(Shape s) {
        shapesList.add(s);
    }

    public double getTotalArea() {
        double sum = 0.0;
        for (Shape bBooty : shapesList) {
                sum += bBooty.getArea();
        }
        return sum;

//        double sum = 0.0;
//        for (int i = 0; i < shapesList.size(); i++) {
//            sum += shapesList.get(i).getArea();
//        }
//        return sum;

    }
}