public class Factory extends AbstractFactory{
    @Override
    Ship getShip(String s) {
        if(s.equals("Sailboat")){
            return new Sailboat();
        }else if (s.equals("Cruise")){
            return new Cruise();
        }else if(s == null){
            return null;
        }
        return null;
    }
}
