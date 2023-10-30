package interfaceEx;

public class Sphere implements Shape, Shape3D{

    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4f*Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 4f*Math.PI*radius;
    }

    @Override
    public double volume() {
        return 4f/3*Math.PI*radius*radius*radius;
    }
}
