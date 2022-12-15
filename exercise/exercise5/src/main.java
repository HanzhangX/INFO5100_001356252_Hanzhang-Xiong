import com.sun.tools.javac.file.SymbolArchive;

public class main {
    public static void main(String[] args) {
        //Factory pattern
        System.out.println("Factory pattern : ");
        CarFactory cf = new CarFactory();
        Car c1 = cf.getCar("SUV");
        c1.run();
        Car c2 = cf.getCar("bicycle");
        c2.run();
        Car c3 = cf.getCar("Sportscar");
        c3.run();
        System.out.println("===================");

        //Singleton Pattern
        System.out.println("Singleton Pattern : ");
        Mywatch mw = Mywatch.getInstance();
        mw.work();
        System.out.println("===================");

        //Abstract Factory Pattern
        System.out.println("Abstract Factory Pattern : ");
        AbstractFactory af = new Factory();
        Ship s1 = af.getShip("Sailboat");
        s1.work();
        Ship s2 = af.getShip("Cruise");
        s2.work();






    }
}
