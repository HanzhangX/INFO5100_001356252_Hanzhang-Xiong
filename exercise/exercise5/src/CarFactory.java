public class CarFactory {

    public Car getCar(String s){
        if(s == null){
            return null;
        }else if(s.equals("SUV")){
            return new SUV();
        }else if(s.equals("Sportscar")){
            return new Sportscar();
        }else if(s.equals("bicycle")){
            return new bicycle();
        }
        return null;
    }

}
