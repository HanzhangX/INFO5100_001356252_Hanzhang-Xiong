public class Lamp {
    String brand;
    float price;
    String material;
    Byte watts;
    short height;
    short weight;
    Byte buttons;
    short voltage;

    public Lamp(){
        System.out.println("I'm a Lamp!");
    }

    public void lighting(){
        System.out.println("You see how i work.");
    }

    public void electric(){
        System.out.println("Careful using.");
    }

    public void turnOn(){
        System.out.println("Click the button.");
    }
}
