package animal;

public class Feline extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Feline noise");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
