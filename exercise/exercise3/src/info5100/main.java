package info5100;

import java.io.*;

public class main {
    public static void main(String[] args) {

        Shape c1 = new Circle(3);
        c1.calculateArea();
        c1.calculatePerimeter();

        //serialize the circle object
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/circle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(c1);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /tmp/circle.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
        Circle c2 = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/circle.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            c2 = (Circle) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Circle class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("I'm c2");
        c2.calculateArea();
        c2.calculatePerimeter();

        Triangle.color = "blue";
        Shape t1 = new Triangle(3,4);
        t1.calculateArea();
        t1.calculatePerimeter();
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/Triangle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(t1);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /tmp/Triangle.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
        Triangle t2 = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/Triangle.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            t2 = (Triangle) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("I'm t2");
        t2.calculateArea();
        t2.calculatePerimeter();


        Shape r1 = new Rectangle(5,8);
        r1.calculateArea();
        r1.calculatePerimeter();
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/Rectangle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(r1);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /tmp/Rectangle.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
        Rectangle r2 = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/Rectangle.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            r2 = (Rectangle) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("I'm r2");
        r2.calculateArea();
        r2.calculatePerimeter();

        Rectangle s1 = new Square(4);
        s1.calculateArea();
        s1.calculatePerimeter();
        try {
            FileOutputStream fileOut = new FileOutputStream("Square.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(s1);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in Square.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
        Square s2 = null;
        try {
            FileInputStream fileIn = new FileInputStream("Square.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            s2 = (Square) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("I'm s2");
        s2.calculateArea();
        s2.calculatePerimeter();




    }
}
