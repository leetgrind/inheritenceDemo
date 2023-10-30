package animal;

public class Animal {

    public void makeNoise() {
        System.out.println("Animal noise");
    }

    public void eat() {
        System.out.println("Animal eat");
    }

    @Override
    public String toString() {
        return "This is an animal";
    }
}
