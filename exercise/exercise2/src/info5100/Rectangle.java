package info5100;

public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("This is a Rectangle with a length of " + length + " and width of " + width + ".");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void calculateArea() {
        int area = length * width;
        System.out.println("My area is " + area );
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = (width + length) * 2;
        System.out.println("My perimeter is " + perimeter );
    }
}
