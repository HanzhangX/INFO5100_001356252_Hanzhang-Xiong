public class Phone {
    float price;
    String brand;
    String color;
    String material;
    Byte generation;
    Byte buttons;
    float screensize;
    short weight;

    public Phone(String color) {
        this.color = color;
        System.out.println("I have a " + color +" cloth!");
    }

    public void ringing(){
        System.out.println("Di di di!");
    }

    public void video(){
        System.out.println("Avengers assemble!");
    }

    public void music(){
        System.out.println("River!");
    }
}
