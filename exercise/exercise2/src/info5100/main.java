package info5100;

public class main {
    public static void main(String[] args) {

        Shape c1 = new Circle(3);
        c1.calculateArea();
        c1.calculatePerimeter();

        Triangle.color = "blue";
        Shape t1 = new Triangle(3,4);
        t1.calculateArea();
        t1.calculateArea();


        Shape r1 = new Rectangle(5,8);
        r1.calculateArea();
        r1.calculatePerimeter();

        Rectangle s1 = new Square(4);
        s1.calculateArea();
        s1.calculatePerimeter();


    }
}
