package AbstractFactoryPattern.Objects;

public class Maruti implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Driving Maruti");
    }

    @Override
    public int cost() {
        return 12000;
    }
}
