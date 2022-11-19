package info5100;

public class Triangle extends Shape{
    public static String color;
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
        System.out.println("This is a triangle with a base of " + base + " and height of " + height + " and my color is " + color + ".");
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void calculateArea() {
        int area = height * base / 2;
        System.out.println("My area is " + area );
    }

    @Override
    public void calculatePerimeter() {

        System.out.println("You cannot know my perimeter." );
    }
}
