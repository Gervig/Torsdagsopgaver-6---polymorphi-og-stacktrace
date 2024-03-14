//  4.2
public class Circle implements Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        double sum = Math.PI * (radius * radius);
        return sum;
    }
}
