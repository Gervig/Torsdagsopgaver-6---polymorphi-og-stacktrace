public class Main {
    public static void main(String[] args) {
        //  4.2
        Circle c1 = new Circle(2.0);
        Square sq1 = new Square(4.0);

        System.out.println(c1.getArea());
        System.out.println(sq1.getArea());

        ShapeBuilder sb1 = new ShapeBuilder();
        sb1.addShape(c1);
        sb1.addShape(sq1);
        System.out.println("Total area of all shapes: "+sb1.getTotalArea());
    }
}