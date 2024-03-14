public class Main {
    public static void main(String[] args) {
        //  4.2
        Circle c1 = new Circle(1.0);
        Square sq1 = new Square(2.0);

        System.out.println(c1.getArea());
        System.out.println(sq1.getArea());

        BootyBuilder bBooty = new BootyBuilder();
        bBooty.addShape(c1);
        bBooty.addShape(sq1);
        System.out.println("Total area of all shapes: "+bBooty.getTotalArea());
    }
}