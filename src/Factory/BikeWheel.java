package Factory;

public class BikeWheel extends Wheel {
    private float diameter;
    private float width;
    private float height;
    public BikeWheel(float diameter, float width,float height) {
        this.diameter = diameter;
        this.width = width;
        this.height = height;
    }

    public float getArea(){
        return (diameter*width)*2;
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
