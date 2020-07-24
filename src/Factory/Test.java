package Factory;

public class Test {
    public static void main(String[] args) {
        Wheel carWheel = Factory.getWheel("Factory.CarWheel", 30, 20,20);
        Wheel carWheel1 = Factory.getWheel("Factory.BikeWheel", 20, 20,20);
        System.out.println(carWheel.getDiameter());
        System.out.println(carWheel1.getDiameter());
        System.out.println(((CarWheel)carWheel).getArea());
        System.out.println(((BikeWheel)carWheel1).getArea());

    }
}
