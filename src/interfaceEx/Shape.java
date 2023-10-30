package interfaceEx;

public interface Shape {

    double area();
    double perimeter();

    default void print() {
        System.out.println("Printing from interface");
    }
}
