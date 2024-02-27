package AbstractFactoryPattern.Objects;

public class Mercedies implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Driving Mercedies");
    }

    @Override
    public int cost() {
        return 500000;
    }
}
