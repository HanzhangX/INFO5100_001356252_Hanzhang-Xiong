public class DinningTable {
    float price;
    String brand;
    String color;
    String material;
    Byte wheels;
    Byte legs;
    int weight;
    int height;

    public DinningTable() {
        System.out.println("I'm a dinning table!");
    }

    public void folding(){
        System.out.println("Put me in corner!");

    }

    public void putStaff(){
        System.out.println("Dinner Time!");

    }

    public void moving(){
        System.out.println("I have wheels!");
    }

    public class dinnerChair{
        float price;
        String brand;
        String color;
        String material;
        Byte legs;
        int weight;
        int height;
        String size;

        public dinnerChair() {
            System.out.println("I'm a dinning chair!");
        }

        public dinnerChair(Byte legs) {
            this.legs = legs;
            System.out.println("I'm a dinning chair!");
        }

        public void introduce(){
            System.out.println("I'm a chair with" + legs + " legs!");
        }

        public void moving(){
            System.out.println("Nice and slow please!");
        }

        public void setPrice(){
            this.price = price;
            System.out.println("I worth $" + price + " !");
        }
    }
}
