package AbstractFactoryPattern.Objects;

public class Toyota implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Driving Toyota");
    }

    @Override
    public int cost() {
        return 10000;
    }
}
