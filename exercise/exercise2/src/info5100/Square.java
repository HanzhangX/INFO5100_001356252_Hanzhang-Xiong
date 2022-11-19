package info5100;

public class Square extends Rectangle{


    public Square(int length, int width) {
        super(length, width);
    }

    public Square(int side){
        super(side,side);
        System.out.println("I'm a Square actually.");
    }

}
