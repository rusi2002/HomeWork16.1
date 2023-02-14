public class Triangle extends Shapes{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double findArea() {
        return base * height/2;
    }

}
