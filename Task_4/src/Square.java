//  4.2
public class Square implements Shape{
    private double side;

    public Square(double side){
        this.side= side;
    }
    @Override
    public double getArea() {
//        double sum = Math.pow(side, 2);   // samme som side^2 (hvis altså java kunne finde ud af det)
        double sum = side * side;
        return sum;
    }
}