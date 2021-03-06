package Factory;

public class CarWheel extends Wheel {
    private float diameter;
    private float width;
    public CarWheel(float diameter, float width) {
        this.diameter = diameter;
        this.width = width;
    }

    public float getArea(){
        return diameter*width;
    }

    @Override
    public float getDiameter() {
        return diameter;
    }
    @Override
    public float getWidth() {
        return width;
    }
}
