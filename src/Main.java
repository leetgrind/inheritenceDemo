import animal.Animal;
import animal.Cat;
import animal.Tiger;

public class Main {

    public static void deepCopyExample() {

        Cat cat1 = new Cat("cat1");
        Cat cat2 = new Cat("cat2");

        // deep copy

        System.out.println("----------------------");
        System.out.println("Deep copy");

        cat2 = new Cat(cat1.getName());

        System.out.println("Cat2 Object: " + cat2);

        cat1.setName("Changed CAT");
        System.out.println("CAT1 object: " + cat1);
        System.out.println("Cat2 Object: " + cat2);

        // shallow copy
        System.out.println("----------------------");
        System.out.println("Shallow copy");
        System.out.println(cat1);
        System.out.println(cat2);
        cat2 = cat1;

        System.out.println(cat2);

        cat2.setName("cat3");

        System.out.println(cat2);

        System.out.println(cat1);
    }


    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];
        //change

        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(11, 23);
        shapes[2] = new Square(23);
        shapes[3] = new Triangle(10, 20);

        for (Shape abc: shapes) {
            printArea(abc);
        }
    }

    private static void printArea(Shape shape) {
        System.out.println(shape.area());
    }


}
