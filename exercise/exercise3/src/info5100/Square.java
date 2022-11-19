package info5100;

import java.io.Serializable;

public class Square extends Rectangle implements Serializable {


    public Square(int length, int width) {
        super(length, width);
    }

    public Square(int side){
        super(side,side);
        System.out.println("I'm a Square actually.");
    }

}
