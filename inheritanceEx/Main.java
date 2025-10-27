package inheritanceEx;


public class Main {
    public static void main(String[] args) {

        Shape sh1 = new Shape("Red", true);
        Shape sh2 = new Shape("Blue", false);
        Shape sh3 = new Shape("Yellow", true);

        Circle c1 = new Circle(3.5, "Green", true);
        Circle c2 = new Circle(2.0, "Black", false);
        Circle c3 = new Circle(4.5, "Purple", true);

        Rectangle r1 = new Rectangle(4.0, 6.0, "Orange", true);
        Rectangle r2 = new Rectangle(2.5, 3.5, "Gray", false);
        Rectangle r3 = new Rectangle(5.5, 7.5, "Pink", true);

        Square s1 = new Square(3.0, "Cyan", true);
        Square s2 = new Square(6.0, "Brown", false);
        Square s3 = new Square(8.0, "Gold", true);


        System.out.println("Area: " + c3.getArea());
        System.out.println("Perimeter: " + c3.getPerimeter());



    }
}