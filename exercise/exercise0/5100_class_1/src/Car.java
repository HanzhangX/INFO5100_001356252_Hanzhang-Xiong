
public class Car {
    float price;
    String brand;
    String color;
    Byte tires;
    Byte generation;
    String name;
    short gasuse;
    short weight;

    public Car(String brand) {
        this.brand = brand;
        System.out.println("I'm a " + brand +" Car !");
    }

    public void run(){
        System.out.println("I can run like wind");
    }

    public void brake(){
        System.out.println("Watch out!");
    }

    public void nightmode(){
        System.out.println("Do you see my light!");
    }

    public class truck{
        float price;
        String brand;
        String color;
        Byte tires;
        Byte load;
        String name;
        short gasuse;
        short weight;

        public truck() {
            System.out.println("I should be a car first!");
        }

        public void loading(){
            System.out.println("I can transfer iron!");
        }

        public void running(){
            System.out.println("I cannot runn too fast!");
        }

        public void rest(){
            System.out.println("I can sleep all night!");
        }
    }
}
