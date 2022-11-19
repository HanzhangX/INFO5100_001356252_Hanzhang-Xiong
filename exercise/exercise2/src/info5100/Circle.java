package info5100;

public class Circle extends Shape{
    private int r;
    private float PI = 3.14f;
    public Circle(int r) {
        this.r = r;
        System.out.println("This is a circle with a radius of " + r);
    }

    @Override
    public void calculateArea() {

        float area = PI * (float) Math.pow(r,2);
        System.out.println("My area is " + area);
    }

    @Override
    public void calculatePerimeter() {
        float perimeter = 2 * PI * r;
        System.out.println("My area is " + perimeter);
    }
}
