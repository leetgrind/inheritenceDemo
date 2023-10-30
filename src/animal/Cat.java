package animal;

public class Cat extends Feline{

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow!!");
    }

    @Override
    public void eat() {
        System.out.println("I like fish");
    }

    @Override
    public String toString() {
        return "My name is " + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
