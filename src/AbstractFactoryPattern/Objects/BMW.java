package AbstractFactoryPattern.Objects;

public class BMW implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving BMW");
    }

    @Override
    public int cost() {
        return 60000;
    }
}
