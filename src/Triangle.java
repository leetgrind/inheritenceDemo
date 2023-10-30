public final class Triangle extends Shape{

    int height;
    int base;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        return (height*base)/2f;
    }
}
