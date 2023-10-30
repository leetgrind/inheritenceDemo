package interfaceEx;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle(10);

        Shape3D sphere = new Sphere(10);

        System.out.println(sphere.volume());
    }
}
