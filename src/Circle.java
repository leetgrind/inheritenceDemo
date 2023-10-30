public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI*radius*radius;
    }

    public void special() {
        System.out.println("I use PI. So i am special");
    }
}
