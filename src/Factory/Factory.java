package Factory;

public class Factory {
    public static Wheel getWheel(String type, float diameter,float width, float height) {
        if("Factory.CarWheel".equalsIgnoreCase(type)){
            return new CarWheel(diameter, width);
        }else if("Factory.BikeWheel".equalsIgnoreCase(type)){
            return new BikeWheel(diameter, width,height);
        }
        return null;
    }
}
