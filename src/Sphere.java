public class Sphere extends Shape{
    double radius;

    public Sphere(double i) {
        radius = i;
    }

    @Override
    public double area() {
        return 4*Math.PI*radius*radius;
    }

    public double volume() {
        return 4f/3*Math.PI*radius*radius*radius;
    }
}
